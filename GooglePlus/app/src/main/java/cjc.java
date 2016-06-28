import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import com.google.android.libraries.social.discovery.views.CelebrityCategoryCardView;
import java.util.ArrayList;

final class cjc
  extends BaseAdapter
{
  int[] a;
  osm[] b;
  
  cjc(ciy paramciy) {}
  
  public final int getCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.length;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    osm localosm1 = (osm)getItem(paramInt);
    CelebrityCategoryCardView localCelebrityCategoryCardView1;
    View localView;
    label406:
    CirclesButton localCirclesButton;
    boolean bool;
    ciy localciy;
    if (paramView == null)
    {
      CelebrityCategoryCardView localCelebrityCategoryCardView2 = (CelebrityCategoryCardView)this.c.a_(null).inflate(efj.sV, null);
      LinearLayout localLinearLayout = (LinearLayout)localCelebrityCategoryCardView2.findViewById(aaw.ax);
      int n = this.c.g().getDimensionPixelSize(efj.nI);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams.setMargins(n, n, n, n);
      for (int i1 = 0; i1 < 6; i1++)
      {
        AvatarView localAvatarView = new AvatarView(this.c.bn);
        localAvatarView.a(1);
        localAvatarView.e = 1;
        localAvatarView.setLayoutParams(localLayoutParams);
        localLinearLayout.addView(localAvatarView);
        localAvatarView.setOnClickListener(new gxn(this.c));
        efj.a(localAvatarView, new gxq(pka.x));
      }
      localCelebrityCategoryCardView1 = localCelebrityCategoryCardView2;
      localCelebrityCategoryCardView1.a(localosm1);
      int i = this.a[(paramInt % this.a.length)];
      float f = localCelebrityCategoryCardView1.getResources().getDimension(efj.KT);
      ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { f, f, f, f, 0.0F, 0.0F, 0.0F, 0.0F }, null, null));
      localShapeDrawable.getPaint().setColor(localCelebrityCategoryCardView1.getResources().getColor(i));
      localCelebrityCategoryCardView1.a.setBackgroundDrawable(localShapeDrawable);
      localView = localCelebrityCategoryCardView1.findViewById(aaw.mn);
      if (localosm1.d.intValue() <= 6) {
        break label559;
      }
      localView.setVisibility(0);
      localView.setTag(aaw.hk, Integer.valueOf(paramInt));
      localView.setTag(aaw.hh, Integer.valueOf(localosm1.a));
      localView.setTag(aaw.hi, localosm1.b);
      localView.setOnClickListener(new gxn(this.c));
      efj.a(localView, new gxq(pju.D));
      localCirclesButton = (CirclesButton)localCelebrityCategoryCardView1.findViewById(aaw.dE);
      localCirclesButton.b(this.c.Z);
      localCirclesButton.setTag(aaw.hk, Integer.valueOf(paramInt));
      bool = ciy.a(this.c, localosm1);
      localCelebrityCategoryCardView1.b = bool;
      localCelebrityCategoryCardView1.a();
      localciy = this.c;
      if (localCirclesButton != null) {
        break label569;
      }
      localciy.b.notifyDataSetChanged();
    }
    label559:
    label569:
    osm localosm2;
    for (;;)
    {
      localCirclesButton.setOnClickListener(new gxn(this.c));
      if (paramInt > this.c.d)
      {
        this.c.d = paramInt;
        efj.a(localCelebrityCategoryCardView1, new kus(pju.d, localosm1.a, paramInt));
        efj.f(localCelebrityCategoryCardView1);
      }
      return localCelebrityCategoryCardView1;
      localCelebrityCategoryCardView1 = (CelebrityCategoryCardView)paramView;
      break;
      localView.setVisibility(8);
      break label406;
      int j = ((Integer)localCirclesButton.getTag(aaw.hk)).intValue();
      localosm2 = localciy.c[j];
      if (!bool) {
        break label647;
      }
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(brn.a(localciy.bn, false));
      localCirclesButton.a(localArrayList);
      localCirclesButton.a(13);
      localCirclesButton.setEnabled(false);
    }
    label647:
    localCirclesButton.a(null);
    int k = Math.min(localosm2.c.length, 6);
    String str;
    if (k == 1) {
      str = localciy.bn.getString(aau.uJ);
    }
    for (;;)
    {
      localCirclesButton.a(str);
      localCirclesButton.a(14);
      localCirclesButton.setEnabled(true);
      break;
      if (k == 2)
      {
        str = localciy.bn.getString(aau.uK);
      }
      else
      {
        mbf localmbf = localciy.bn;
        int m = aau.uI;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(k);
        str = localmbf.getString(m, arrayOfObject);
      }
    }
  }
  
  public final boolean isEmpty()
  {
    return (this.b == null) || (this.b.length == 0);
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjc
 * JD-Core Version:    0.7.0.1
 */