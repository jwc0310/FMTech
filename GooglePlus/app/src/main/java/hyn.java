import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

public final class hyn
  extends ArrayAdapter<hyf>
{
  final Context a;
  final hza b;
  final hyf[] c;
  List<hyf> d;
  private final Resources e;
  private final int f;
  private final LayoutInflater g;
  private final String h;
  private Filter i;
  
  public hyn(Context paramContext, int paramInt, hyf[] paramArrayOfhyf, String paramString, hza paramhza)
  {
    super(paramContext, paramInt);
    this.a = paramContext;
    this.e = paramContext.getResources();
    this.f = paramInt;
    this.g = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.h = paramString;
    this.b = paramhza;
    this.c = paramArrayOfhyf;
    this.d = Arrays.asList(paramArrayOfhyf);
  }
  
  static boolean a(hyf paramhyf)
  {
    return paramhyf.e.a != null;
  }
  
  public final int getCount()
  {
    return this.d.size();
  }
  
  public final Filter getFilter()
  {
    if (this.i == null) {
      this.i = new hyt(this);
    }
    return this.i;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.g.inflate(this.f, null);
    }
    hyi localhyi = (hyi)mbb.a(getContext(), hyi.class);
    hyf localhyf = (hyf)getItem(paramInt);
    TextView localTextView1;
    Long localLong;
    String str1;
    Boolean localBoolean;
    String str2;
    label164:
    int j;
    label185:
    View localView;
    int k;
    if ((localhyf != null) && (!TextUtils.isEmpty(this.h)))
    {
      localTextView1 = (TextView)paramView.findViewById(efj.Mp);
      localTextView1.setText(localhyf.a);
      TextView localTextView2 = (TextView)paramView.findViewById(efj.Mr);
      localLong = localhyi.c(localhyf, this.h);
      str1 = localhyi.a(localhyf, this.h);
      if (!str1.equals("true")) {
        break label270;
      }
      localBoolean = Boolean.TRUE;
      if (localLong == null) {
        break label365;
      }
      if ((localLong != null) && (localLong.longValue() >= 1000L)) {
        break label294;
      }
      str2 = String.valueOf(localLong);
      localTextView2.setText(str2);
      if ((localLong == null) && (localBoolean != null)) {
        break label391;
      }
      j = -16777216;
      localTextView2.setTextColor(j);
      localView = paramView.findViewById(efj.Mq);
      if (localhyf.e.a == null) {
        break label413;
      }
      k = 1;
      label215:
      if ((k != 0) || (this.b.a(localhyf))) {
        break label419;
      }
      localView.setVisibility(8);
      localTextView1.setBackgroundColor(this.e.getColor(efj.Mk));
    }
    for (;;)
    {
      paramView.setOnClickListener(new hyo(this, localhyf));
      return paramView;
      label270:
      if (str1.equals("false"))
      {
        localBoolean = Boolean.FALSE;
        break;
      }
      localBoolean = null;
      break;
      label294:
      String str3 = String.valueOf(localLong);
      String str4 = String.valueOf(lwd.a(localLong));
      str2 = 3 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + " [" + str4 + "]";
      break label164;
      label365:
      if (localBoolean != null) {}
      for (Object localObject = localBoolean;; localObject = str1)
      {
        str2 = String.valueOf(localObject);
        break;
      }
      label391:
      if (localBoolean.booleanValue())
      {
        j = -16776961;
        break label185;
      }
      j = -65536;
      break label185;
      label413:
      k = 0;
      break label215;
      label419:
      localView.setVisibility(0);
      localTextView1.setBackgroundColor(this.e.getColor(efj.Mn));
      TextView localTextView3 = (TextView)paramView.findViewById(efj.Mt);
      TextView localTextView4 = (TextView)paramView.findViewById(efj.Mu);
      if (localhyf.e.a != null) {}
      for (int m = 1;; m = 0)
      {
        if (m == 0) {
          break label543;
        }
        localTextView3.setText(dl.l);
        localTextView4.setText(localhyf.e.a);
        localTextView3.setBackgroundColor(this.e.getColor(efj.Mi));
        localTextView4.setBackgroundColor(this.e.getColor(efj.Mj));
        break;
      }
      label543:
      localTextView3.setText(dl.j);
      localTextView4.setText(str1);
      localTextView3.setBackgroundColor(this.e.getColor(efj.Ml));
      localTextView4.setBackgroundColor(this.e.getColor(efj.Mm));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyn
 * JD-Core Version:    0.7.0.1
 */