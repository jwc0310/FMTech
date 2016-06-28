import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.viewer.components.comments.DetailsView;
import java.util.List;
import java.util.Set;

public final class baq
  implements atq
{
  hdf a;
  lxx b;
  String c;
  String d;
  String e;
  String f;
  long g;
  private Context h;
  
  baq(Context paramContext)
  {
    this.h = paramContext;
  }
  
  public final int a()
  {
    return -1 + bao.b;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    DetailsView localDetailsView1 = (DetailsView)paramView;
    if (localDetailsView1 == null) {}
    for (DetailsView localDetailsView2 = (DetailsView)((LayoutInflater)this.h.getSystemService("layout_inflater")).inflate(efj.vJ, paramViewGroup, false);; localDetailsView2 = localDetailsView1)
    {
      String str1 = this.c;
      String str2 = this.d;
      String str3 = this.e;
      if (!TextUtils.equals(localDetailsView2.e, str1))
      {
        localDetailsView2.ap_();
        localDetailsView2.e = str1;
        if (str2 == null) {
          str2 = "";
        }
        localDetailsView2.f = str2;
        if (localDetailsView2.d != null)
        {
          localDetailsView2.a.remove(localDetailsView2.d);
          localDetailsView2.i.remove(localDetailsView2.d);
        }
        localDetailsView2.d = new dvq(localDetailsView2, localDetailsView2.e, str3, localDetailsView2.f, localDetailsView2.b, 2);
        localDetailsView2.d.b = localDetailsView2.b;
        localDetailsView2.a.add(localDetailsView2.d);
        localDetailsView2.i.add(localDetailsView2.d);
        localDetailsView2.b();
      }
      String str4 = this.f;
      localDetailsView2.h = null;
      if (!TextUtils.isEmpty(str4)) {
        localDetailsView2.h = lww.b(str4);
      }
      long l = this.g;
      localDetailsView2.g = lwd.b(localDetailsView2.getContext(), l).toString();
      localDetailsView2.requestLayout();
      localDetailsView2.b = this.a;
      if (localDetailsView2.d != null) {
        localDetailsView2.d.b = localDetailsView2.b;
      }
      localDetailsView2.c = this.b;
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      StringBuilder localStringBuilder;
      CharSequence[] arrayOfCharSequence;
      if (localmfz.b == 1)
      {
        localStringBuilder = localmfz.a;
        arrayOfCharSequence = new CharSequence[3];
        arrayOfCharSequence[0] = localDetailsView2.f;
        arrayOfCharSequence[1] = localDetailsView2.g;
        if (localDetailsView2.h != null) {
          break label431;
        }
      }
      label431:
      for (String str5 = "";; str5 = localDetailsView2.h.toString())
      {
        arrayOfCharSequence[2] = str5;
        efj.a(localStringBuilder, arrayOfCharSequence);
        localDetailsView2.setContentDescription(localStringBuilder.toString());
        return localDetailsView2;
        localStringBuilder = new StringBuilder(256);
        break;
      }
    }
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     baq
 * JD-Core Version:    0.7.0.1
 */