import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public final class dgg
  extends BaseAdapter
{
  private static String d;
  private List<hxm> a;
  private Context b;
  private hxk c;
  
  public dgg(Context paramContext)
  {
    this.b = paramContext;
    if (d == null) {
      d = paramContext.getResources().getString(aau.uN);
    }
  }
  
  private final View a(int paramInt, View paramView, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    Object localObject;
    if (paramView == null) {
      if (paramBoolean) {
        localObject = LayoutInflater.from(this.b).inflate(efj.wA, paramViewGroup, false);
      }
    }
    for (;;)
    {
      if ((localObject instanceof TextView))
      {
        hxm localhxm = (hxm)this.a.get(paramInt);
        TimeZone localTimeZone = localhxm.a;
        long l = localhxm.b;
        TextView localTextView = (TextView)localObject;
        String str = d;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = localTimeZone.getDisplayName(localTimeZone.inDaylightTime(new Date()), 1);
        arrayOfObject[1] = Long.valueOf(l / 3600000L);
        arrayOfObject[2] = Long.valueOf(Math.abs((l - 3600000L * (l / 3600000L)) / 60000L));
        localTextView.setText(String.format(str, arrayOfObject));
      }
      return localObject;
      localObject = new TextView(this.b);
      continue;
      localObject = paramView;
    }
  }
  
  public final void a(hxk paramhxk)
  {
    this.c = paramhxk;
    this.a = this.c.a;
    notifyDataSetChanged();
  }
  
  public final int getCount()
  {
    return this.a.size();
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, true);
  }
  
  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgg
 * JD-Core Version:    0.7.0.1
 */