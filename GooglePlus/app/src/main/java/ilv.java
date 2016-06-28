import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class ilv
  extends BaseAdapter
{
  private final Context a;
  private final int[] b;
  private final boolean c;
  
  ilv(Context paramContext, int[] paramArrayOfInt, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramArrayOfInt;
    this.c = paramBoolean;
  }
  
  public final int getCount()
  {
    int i = this.b.length;
    if (this.c) {}
    for (int j = 1;; j = 0) {
      return j + i;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if ((this.c) && (paramInt == this.b.length)) {
      return 1;
    }
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    switch (getItemViewType(paramInt))
    {
    default: 
      paramView = null;
    }
    do
    {
      return paramView;
      iov localiov = (iov)paramView;
      if (localiov == null) {
        localiov = new iov(this.a);
      }
      localiov.a = this.b[paramInt];
      if (localiov.b.c(localiov.a))
      {
        gjb localgjb = localiov.b.a(localiov.a);
        localiov.c.setVisibility(0);
        localiov.d.setVisibility(4);
        String str1 = localgjb.b("display_name");
        String str2 = localgjb.b("account_name");
        String str3 = localgjb.b("gaia_id");
        String str4 = localgjb.b("profile_photo_url");
        if (TextUtils.isEmpty(str1))
        {
          localiov.e.setText(str2);
          localiov.f.setVisibility(8);
        }
        for (;;)
        {
          localiov.g.a(str3, str4);
          return localiov;
          localiov.e.setText(str1);
          localiov.f.setText(str2);
          localiov.f.setVisibility(0);
        }
      }
      localiov.c.setVisibility(8);
      return localiov;
    } while (paramView != null);
    return LayoutInflater.from(this.a).inflate(efj.Ou, null);
  }
  
  public final int getViewTypeCount()
  {
    if (this.c) {
      return 2;
    }
    return 1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ilv
 * JD-Core Version:    0.7.0.1
 */