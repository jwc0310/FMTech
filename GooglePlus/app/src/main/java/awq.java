import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.List;
import java.util.Locale;

final class awq
  extends BaseAdapter
{
  List<aws> a;
  private final LayoutInflater b;
  
  public awq(List<aws> paramList, LayoutInflater paramLayoutInflater)
  {
    this.a = paramList;
    this.b = paramLayoutInflater;
  }
  
  public final int getCount()
  {
    if (this.a != null) {
      return this.a.size();
    }
    return 0;
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if ((this.a == null) || (this.a.size() <= paramInt)) {
      return -1;
    }
    return ((aws)this.a.get(paramInt)).a;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    aws localaws = (aws)this.a.get(paramInt);
    if (getItemViewType(paramInt) == 0)
    {
      if (paramView == null) {
        paramView = this.b.inflate(efj.tK, paramViewGroup, false);
      }
      int k = aaw.eT;
      MediaView localMediaView = (MediaView)paramView.findViewById(k);
      Context localContext = paramView.getContext();
      double d1 = ((Double)localaws.b).doubleValue();
      double d2 = ((Double)localaws.c).doubleValue();
      int m = localContext.getResources().getDimensionPixelSize(efj.mh);
      int n = Math.max((int)efj.a(efj.K(localContext)), m);
      Uri.Builder localBuilder1 = Uri.parse("https://maps.googleapis.com/maps/api/staticmap").buildUpon();
      Uri.Builder localBuilder2 = localBuilder1.appendQueryParameter("zoom", "17");
      Locale localLocale1 = Locale.US;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(n);
      arrayOfObject1[1] = Integer.valueOf(n);
      Uri.Builder localBuilder3 = localBuilder2.appendQueryParameter("size", String.format(localLocale1, "%dx%d", arrayOfObject1)).appendQueryParameter("format", "png").appendQueryParameter("maptype", "roadmap").appendQueryParameter("sensor", "true");
      Locale localLocale2 = Locale.US;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = "red";
      arrayOfObject2[1] = Double.valueOf(d1);
      arrayOfObject2[2] = Double.valueOf(d2);
      localBuilder3.appendQueryParameter("markers", String.format(localLocale2, "color:%s|%.6f,%.6f", arrayOfObject2));
      String str1 = dun.a.a();
      if (!TextUtils.isEmpty(str1)) {
        localBuilder1.appendQueryParameter("key", str1);
      }
      String str2 = localBuilder1.build().toString();
      localMediaView.e(1);
      localMediaView.a(ipf.a(localContext, str2, ipm.a), null, true);
      return paramView;
    }
    if (paramView == null) {
      paramView = this.b.inflate(efj.tJ, paramViewGroup, false);
    }
    int i = aaw.er;
    TextView localTextView1 = (TextView)paramView.findViewById(i);
    int j = aaw.mi;
    TextView localTextView2 = (TextView)paramView.findViewById(j);
    localTextView1.setText((String)localaws.b);
    localTextView2.setText((String)localaws.c);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awq
 * JD-Core Version:    0.7.0.1
 */