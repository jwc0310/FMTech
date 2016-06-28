import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import java.util.List;

public final class izo
  extends BaseAdapter
{
  final izq a;
  public List<izc> b;
  private final Context c;
  
  public izo(Context paramContext, izq paramizq)
  {
    this.c = paramContext;
    this.a = paramizq;
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final int getCount()
  {
    if (this.b != null) {
      return this.b.size();
    }
    return 0;
  }
  
  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    izc localizc = (izc)this.b.get(paramInt);
    if (paramView == null) {
      paramView = LayoutInflater.from(this.c).inflate(efj.Qc, paramViewGroup, false);
    }
    long l = localizc.a;
    String str1 = localizc.b;
    int i = localizc.c;
    String str2 = localizc.e;
    boolean bool = localizc.f;
    int j = ehr.cT;
    ImageView localImageView1 = (ImageView)paramView.findViewById(j);
    int k = ehr.cR;
    TextView localTextView1 = (TextView)paramView.findViewById(k);
    int m = ehr.cN;
    ImageView localImageView2 = (ImageView)paramView.findViewById(m);
    int n = ehr.cP;
    TextView localTextView2 = (TextView)paramView.findViewById(n);
    int i1 = ehr.cM;
    TextView localTextView3 = (TextView)paramView.findViewById(i1);
    int i2 = ehr.cQ;
    ImageView localImageView3 = (ImageView)paramView.findViewById(i2);
    efj.a(localImageView2, new gxq(pjv.a));
    localImageView1.setVisibility(8);
    Date localDate = new Date(l);
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    int i3;
    label258:
    java.text.DateFormat localDateFormat;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      if (System.currentTimeMillis() - localDate.getTime() >= 86400000L) {
        break label434;
      }
      i3 = 1;
      if (i3 == 0) {
        break label440;
      }
      localDateFormat = android.text.format.DateFormat.getTimeFormat(this.c);
      label272:
      localStringBuilder.append(localDateFormat.format(localDate));
      if (!TextUtils.isEmpty(str1)) {
        localStringBuilder.append(" - ").append(str1);
      }
      localTextView2.setText(mfx.b(localStringBuilder));
      localTextView3.setText(str2);
      switch (i)
      {
      }
    }
    for (;;)
    {
      label364:
      localImageView3.setVisibility(4);
      for (;;)
      {
        if (!bool) {
          break label538;
        }
        localImageView2.setVisibility(0);
        localImageView2.setOnClickListener(new gxn(new izp(this, ((izc)this.b.get(paramInt)).d)));
        return paramView;
        localStringBuilder = new StringBuilder(256);
        break;
        label434:
        i3 = 0;
        break label258;
        label440:
        localDateFormat = android.text.format.DateFormat.getDateFormat(this.c);
        break label272;
        localTextView1.setText(this.c.getString(efj.Qj));
        break label364;
        localTextView1.setText(this.c.getString(efj.Ql));
        break label364;
        localTextView1.setText(this.c.getString(efj.Qi));
        localImageView3.setImageResource(aau.Ar);
        localImageView3.setVisibility(0);
      }
      localTextView1.setText(this.c.getString(efj.Qk));
    }
    label538:
    localImageView2.setVisibility(8);
    return paramView;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izo
 * JD-Core Version:    0.7.0.1
 */