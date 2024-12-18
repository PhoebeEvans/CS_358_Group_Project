package com.example.maandparailroadapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.maandparailroadapp.databinding.FragmentAdminSavedEventsBindingImpl;
import com.example.maandparailroadapp.databinding.FragmentEventsCalendarBindingImpl;
import com.example.maandparailroadapp.databinding.FragmentUserSavedEventsBindingImpl;
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
  private static final int LAYOUT_FRAGMENTADMINSAVEDEVENTS = 1;

  private static final int LAYOUT_FRAGMENTEVENTSCALENDAR = 2;

  private static final int LAYOUT_FRAGMENTUSERSAVEDEVENTS = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.maandparailroadapp.R.layout.fragment_admin_saved_events, LAYOUT_FRAGMENTADMINSAVEDEVENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.maandparailroadapp.R.layout.fragment_events_calendar, LAYOUT_FRAGMENTEVENTSCALENDAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.maandparailroadapp.R.layout.fragment_user_saved_events, LAYOUT_FRAGMENTUSERSAVEDEVENTS);
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
        case  LAYOUT_FRAGMENTADMINSAVEDEVENTS: {
          if ("layout/fragment_admin_saved_events_0".equals(tag)) {
            return new FragmentAdminSavedEventsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_admin_saved_events is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEVENTSCALENDAR: {
          if ("layout/fragment_events_calendar_0".equals(tag)) {
            return new FragmentEventsCalendarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_events_calendar is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERSAVEDEVENTS: {
          if ("layout/fragment_user_saved_events_0".equals(tag)) {
            return new FragmentUserSavedEventsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_saved_events is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_admin_saved_events_0", com.example.maandparailroadapp.R.layout.fragment_admin_saved_events);
      sKeys.put("layout/fragment_events_calendar_0", com.example.maandparailroadapp.R.layout.fragment_events_calendar);
      sKeys.put("layout/fragment_user_saved_events_0", com.example.maandparailroadapp.R.layout.fragment_user_saved_events);
    }
  }
}
