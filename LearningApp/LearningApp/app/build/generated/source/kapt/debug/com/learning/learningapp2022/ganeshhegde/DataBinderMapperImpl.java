package com.learning.learningapp2022.ganeshhegde;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.learning.learningapp2022.ganeshhegde.databinding.ActivityNav2BindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.CoroutinesBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.DatabindingBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentEmailBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentHome2BindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentHomeBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentNameBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentSecondBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentTermsBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentWelcomeBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.LivedataexampleBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.NavexampleBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.RecyclerDemoBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.RoomListItemBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.RoomSubscribersBindingImpl;
import com.learning.learningapp2022.ganeshhegde.databinding.VmactivityBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYNAV2 = 1;

  private static final int LAYOUT_COROUTINES = 2;

  private static final int LAYOUT_DATABINDING = 3;

  private static final int LAYOUT_FRAGMENTEMAIL = 4;

  private static final int LAYOUT_FRAGMENTHOME = 5;

  private static final int LAYOUT_FRAGMENTHOME2 = 6;

  private static final int LAYOUT_FRAGMENTNAME = 7;

  private static final int LAYOUT_FRAGMENTSECOND = 8;

  private static final int LAYOUT_FRAGMENTTERMS = 9;

  private static final int LAYOUT_FRAGMENTWELCOME = 10;

  private static final int LAYOUT_LIVEDATAEXAMPLE = 11;

  private static final int LAYOUT_NAVEXAMPLE = 12;

  private static final int LAYOUT_RECYCLERDEMO = 13;

  private static final int LAYOUT_ROOMLISTITEM = 14;

  private static final int LAYOUT_ROOMSUBSCRIBERS = 15;

  private static final int LAYOUT_VMACTIVITY = 16;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(16);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.activity_nav2, LAYOUT_ACTIVITYNAV2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.coroutines, LAYOUT_COROUTINES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.databinding, LAYOUT_DATABINDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_email, LAYOUT_FRAGMENTEMAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_home2, LAYOUT_FRAGMENTHOME2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_name, LAYOUT_FRAGMENTNAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_second, LAYOUT_FRAGMENTSECOND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_terms, LAYOUT_FRAGMENTTERMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.fragment_welcome, LAYOUT_FRAGMENTWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.livedataexample, LAYOUT_LIVEDATAEXAMPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.navexample, LAYOUT_NAVEXAMPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.recycler_demo, LAYOUT_RECYCLERDEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.room_list_item, LAYOUT_ROOMLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.room_subscribers, LAYOUT_ROOMSUBSCRIBERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.learning.learningapp2022.ganeshhegde.R.layout.vmactivity, LAYOUT_VMACTIVITY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYNAV2: {
          if ("layout/activity_nav2_0".equals(tag)) {
            return new ActivityNav2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_nav2 is invalid. Received: " + tag);
        }
        case  LAYOUT_COROUTINES: {
          if ("layout/coroutines_0".equals(tag)) {
            return new CoroutinesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for coroutines is invalid. Received: " + tag);
        }
        case  LAYOUT_DATABINDING: {
          if ("layout/databinding_0".equals(tag)) {
            return new DatabindingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for databinding is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEMAIL: {
          if ("layout/fragment_email_0".equals(tag)) {
            return new FragmentEmailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_email is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME2: {
          if ("layout/fragment_home2_0".equals(tag)) {
            return new FragmentHome2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home2 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNAME: {
          if ("layout/fragment_name_0".equals(tag)) {
            return new FragmentNameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_name is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSECOND: {
          if ("layout/fragment_second_0".equals(tag)) {
            return new FragmentSecondBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_second is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTERMS: {
          if ("layout/fragment_terms_0".equals(tag)) {
            return new FragmentTermsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_terms is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment_welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_LIVEDATAEXAMPLE: {
          if ("layout/livedataexample_0".equals(tag)) {
            return new LivedataexampleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for livedataexample is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVEXAMPLE: {
          if ("layout/navexample_0".equals(tag)) {
            return new NavexampleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for navexample is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERDEMO: {
          if ("layout/recycler_demo_0".equals(tag)) {
            return new RecyclerDemoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_demo is invalid. Received: " + tag);
        }
        case  LAYOUT_ROOMLISTITEM: {
          if ("layout/room_list_item_0".equals(tag)) {
            return new RoomListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for room_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ROOMSUBSCRIBERS: {
          if ("layout/room_subscribers_0".equals(tag)) {
            return new RoomSubscribersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for room_subscribers is invalid. Received: " + tag);
        }
        case  LAYOUT_VMACTIVITY: {
          if ("layout/vmactivity_0".equals(tag)) {
            return new VmactivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vmactivity is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "employee");
      sKeys.put(2, "ldExampleViewModel");
      sKeys.put(3, "subViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(16);

    static {
      sKeys.put("layout/activity_nav2_0", com.learning.learningapp2022.ganeshhegde.R.layout.activity_nav2);
      sKeys.put("layout/coroutines_0", com.learning.learningapp2022.ganeshhegde.R.layout.coroutines);
      sKeys.put("layout/databinding_0", com.learning.learningapp2022.ganeshhegde.R.layout.databinding);
      sKeys.put("layout/fragment_email_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_email);
      sKeys.put("layout/fragment_home_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_home);
      sKeys.put("layout/fragment_home2_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_home2);
      sKeys.put("layout/fragment_name_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_name);
      sKeys.put("layout/fragment_second_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_second);
      sKeys.put("layout/fragment_terms_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_terms);
      sKeys.put("layout/fragment_welcome_0", com.learning.learningapp2022.ganeshhegde.R.layout.fragment_welcome);
      sKeys.put("layout/livedataexample_0", com.learning.learningapp2022.ganeshhegde.R.layout.livedataexample);
      sKeys.put("layout/navexample_0", com.learning.learningapp2022.ganeshhegde.R.layout.navexample);
      sKeys.put("layout/recycler_demo_0", com.learning.learningapp2022.ganeshhegde.R.layout.recycler_demo);
      sKeys.put("layout/room_list_item_0", com.learning.learningapp2022.ganeshhegde.R.layout.room_list_item);
      sKeys.put("layout/room_subscribers_0", com.learning.learningapp2022.ganeshhegde.R.layout.room_subscribers);
      sKeys.put("layout/vmactivity_0", com.learning.learningapp2022.ganeshhegde.R.layout.vmactivity);
    }
  }
}
