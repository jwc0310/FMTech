import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.stream.legacy.views.StreamAlbumViewGroup;

public final class lpg
  extends BaseAdapter
{
  public lpg(StreamAlbumViewGroup paramStreamAlbumViewGroup) {}
  
  public final int getCount()
  {
    return this.a.f;
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((this.a.j == null) || (this.a.f <= paramInt)) {
      return null;
    }
    Context localContext = this.a.getContext();
    MediaView localMediaView;
    int i;
    label68:
    int j;
    label132:
    Resources localResources;
    String str1;
    label209:
    label245:
    int i3;
    label310:
    StreamAlbumViewGroup localStreamAlbumViewGroup;
    if ((paramView instanceof MediaView))
    {
      localMediaView = (MediaView)paramView;
      if ((this.a.n) || (!this.a.b())) {
        break label764;
      }
      i = 4;
      mbb.b(localContext).a(log.class);
      localMediaView.s = 0;
      localMediaView.b(log.a(this.a.g), 0);
      localMediaView.E = 2;
      if (paramInt >= -1 + this.a.f) {
        break label770;
      }
      j = this.a.a.X;
      localMediaView.setPadding(0, 0, j, 0);
      localResources = localContext.getResources();
      if (this.a.f != 1) {
        break label862;
      }
      if (this.a.j[paramInt].e != ipm.b) {
        break label776;
      }
      int i7 = aau.Di;
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(1);
      str1 = localResources.getQuantityString(i7, 1, arrayOfObject5);
      if (this.a.f != 1) {
        break label978;
      }
      localMediaView.b(1);
      localMediaView.N = 0.5F;
      localMediaView.p = null;
      localMediaView.b(false);
      if (this.a.c != null)
      {
        localMediaView.s = 0;
        localMediaView.b(1);
        localMediaView.N = 0.5F;
      }
      localMediaView.e(i);
      if (this.a.d != null)
      {
        if (this.a.d.m != ipm.b) {
          break label1016;
        }
        i3 = 1;
        if (i3 != 0)
        {
          String str2 = this.a.d.a;
          if (!TextUtils.isEmpty(str2)) {
            str1 = StreamAlbumViewGroup.a(str1, str2);
          }
        }
      }
      localMediaView.setContentDescription(str1);
      if ((this.a.t != null) && (this.a.t.f()) && (this.a.s)) {
        localMediaView.h();
      }
      localMediaView.n = this.a.o;
      localMediaView.setTag(Integer.valueOf(paramInt));
      if (this.a.f <= paramInt) {
        break label1097;
      }
      if (this.a.b == null) {
        break label1022;
      }
      if ((this.a.b.a <= paramInt) || (!StreamAlbumViewGroup.a(this.a, this.a.b.f[paramInt]))) {
        break label1097;
      }
      localStreamAlbumViewGroup = this.a;
    }
    for (;;)
    {
      label480:
      boolean bool;
      if (localStreamAlbumViewGroup != null)
      {
        bool = true;
        label488:
        localMediaView.setClickable(bool);
        if ((!this.a.s) || (!localMediaView.isClickable())) {
          break label1090;
        }
        efj.a(localMediaView, new gxq(pkh.I));
      }
      label770:
      label776:
      label1083:
      label1090:
      for (Object localObject = new gxn(localStreamAlbumViewGroup);; localObject = localStreamAlbumViewGroup)
      {
        localMediaView.setOnClickListener((View.OnClickListener)localObject);
        localMediaView.a(this.a.j[paramInt]);
        localMediaView.c(this.a.s);
        if (localMediaView.p()) {
          if (!this.a.s) {
            break label1083;
          }
        }
        for (int i2 = 14;; i2 = 13)
        {
          new kpu(i2).b(this.a.getContext());
          localMediaView.Q = iqr.c;
          localMediaView.f();
          if ((this.a.v != null) && (this.a.u == null)) {
            this.a.u = localMediaView;
          }
          int m = this.a.k[paramInt];
          int n = -1 + this.a.f;
          int i1 = 0;
          if (paramInt < n) {
            i1 = this.a.a.X;
          }
          localMediaView.setLayoutParams(new lxk(m + i1, this.a.l));
          localMediaView.F = this.a;
          localMediaView.r = efj.b(this.a.getResources());
          return localMediaView;
          localMediaView = new MediaView(localContext);
          break;
          label764:
          i = 0;
          break label68;
          j = 0;
          break label132;
          if (this.a.j[paramInt].e == ipm.d)
          {
            int i6 = aau.Dd;
            Object[] arrayOfObject4 = new Object[1];
            arrayOfObject4[0] = Integer.valueOf(1);
            str1 = localResources.getQuantityString(i6, 1, arrayOfObject4);
            break label209;
          }
          int i5 = aau.Dh;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(1);
          str1 = localResources.getQuantityString(i5, 1, arrayOfObject3);
          break label209;
          label862:
          if (this.a.j[paramInt].e == ipm.d)
          {
            int i4 = do.at;
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(paramInt + 1);
            arrayOfObject2[1] = Integer.valueOf(this.a.f);
            str1 = localResources.getString(i4, arrayOfObject2);
            break label209;
          }
          int k = do.ax;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(paramInt + 1);
          arrayOfObject1[1] = Integer.valueOf(this.a.f);
          str1 = localContext.getString(k, arrayOfObject1);
          break label209;
          label978:
          localMediaView.b(0);
          localMediaView.N = 0.4F;
          localMediaView.p = this.a.a.j;
          localMediaView.b(true);
          break label245;
          label1016:
          i3 = 0;
          break label310;
          label1022:
          if (this.a.d != null)
          {
            if (!StreamAlbumViewGroup.a(this.a, this.a.d)) {
              break label1097;
            }
            localStreamAlbumViewGroup = this.a;
            break label480;
          }
          if (this.a.c == null) {
            break label1097;
          }
          localStreamAlbumViewGroup = this.a;
          break label480;
          bool = false;
          break label488;
        }
      }
      label1097:
      localStreamAlbumViewGroup = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpg
 * JD-Core Version:    0.7.0.1
 */