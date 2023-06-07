package com.learning.learningapp2022.ganeshhegde.roomdb;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SubscribeDAO_Impl implements SubscribeDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Subscriber> __insertionAdapterOfSubscriber;

  private final EntityDeletionOrUpdateAdapter<Subscriber> __deletionAdapterOfSubscriber;

  private final EntityDeletionOrUpdateAdapter<Subscriber> __updateAdapterOfSubscriber;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SubscribeDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubscriber = new EntityInsertionAdapter<Subscriber>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `subscriber_data_table` (`sub_id`,`sub_name`,`sub_email`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscriber value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
      }
    };
    this.__deletionAdapterOfSubscriber = new EntityDeletionOrUpdateAdapter<Subscriber>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `subscriber_data_table` WHERE `sub_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscriber value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfSubscriber = new EntityDeletionOrUpdateAdapter<Subscriber>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `subscriber_data_table` SET `sub_id` = ?,`sub_name` = ?,`sub_email` = ? WHERE `sub_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscriber value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM subscriber_data_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertSubscriber(final Subscriber subscriber,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSubscriber.insert(subscriber);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteSubscriber(final Subscriber subscriber,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSubscriber.handle(subscriber);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSubscriber(final Subscriber subscriber,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSubscriber.handle(subscriber);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<Subscriber>> getAllSubscribers() {
    final String _sql = "SELECT * FROM subscriber_data_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"subscriber_data_table"}, false, new Callable<List<Subscriber>>() {
      @Override
      public List<Subscriber> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_email");
          final List<Subscriber> _result = new ArrayList<Subscriber>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Subscriber _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            _item = new Subscriber(_tmpId,_tmpName,_tmpEmail);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
