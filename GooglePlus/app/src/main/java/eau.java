import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.plus.widget.locations.LocationsWidgetConfigurationActivity;
import java.util.HashMap;

public final class eau
  extends hqf
{
  public eau(LocationsWidgetConfigurationActivity paramLocationsWidgetConfigurationActivity, Context paramContext)
  {
    super(paramContext);
    hqg localhqg1 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg4 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg4, 0, this.aO);
      this.aN = arrayOfhqg4;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i = this.aO;
    this.aO = (i + 1);
    arrayOfhqg1[i] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg3 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg3, 0, this.aO);
      this.aN = arrayOfhqg3;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int j = this.aO;
    this.aO = (j + 1);
    arrayOfhqg2[j] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
  }
  
  public final int a()
  {
    return 2;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    return paramInt1;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 0: 
      return new hgl(paramContext);
    }
    return new jop(paramContext);
  }
  
  protected final View a(Context paramContext, int paramInt, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.a.getLayoutInflater().inflate(efj.uw, null);
  }
  
  protected final void a(View paramView, int paramInt, Cursor paramCursor)
  {
    TextView localTextView = (TextView)paramView;
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      localTextView.setText(aau.jx);
      return;
    }
    localTextView.setText(aau.jy);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 0: 
      hgl localhgl = (hgl)paramView;
      int i = paramCursor.getInt(4);
      String str1 = paramCursor.getString(1);
      String str2 = paramCursor.getString(2);
      int j = paramCursor.getInt(6);
      LocationsWidgetConfigurationActivity localLocationsWidgetConfigurationActivity = this.a;
      ikt localikt = this.a.d;
      efj.k();
      localhgl.a(str1, i, str2, j, aau.a(localLocationsWidgetConfigurationActivity, localikt.e, i));
      int k = ((Integer)this.a.e.get(paramCursor.getString(1))).intValue();
      Resources localResources = this.a.getResources();
      if (k == 0) {}
      int m;
      Object[] arrayOfObject;
      for (String str3 = localResources.getString(aau.dC);; str3 = localResources.getQuantityString(m, k, arrayOfObject))
      {
        localhgl.a(str3);
        return;
        m = efj.xj;
        arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(k);
      }
    }
    jop localjop = (jop)paramView;
    localjop.a(paramCursor.getString(0), efj.E(paramCursor.getString(1)));
    localjop.g = paramCursor.getString(2);
    localjop.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eau
 * JD-Core Version:    0.7.0.1
 */