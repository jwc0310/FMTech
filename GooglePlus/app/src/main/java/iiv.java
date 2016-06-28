import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.location.FriendLocationsListItemView;

public final class iiv
  extends BaseAdapter
{
  public nve[] a;
  private final Context b;
  private final iiu c;
  private final boolean d;
  private final String e;
  
  public iiv(Context paramContext, nve[] paramArrayOfnve, iiu paramiiu, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    this.b = paramContext;
    this.a = paramArrayOfnve;
    this.c = paramiiu;
    this.d = true;
    this.e = paramString;
  }
  
  public final int getCount()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.length;
  }
  
  public final Object getItem(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    FriendLocationsListItemView localFriendLocationsListItemView;
    nve localnve;
    CharSequence localCharSequence;
    if ((paramView instanceof FriendLocationsListItemView))
    {
      localFriendLocationsListItemView = (FriendLocationsListItemView)paramView;
      localnve = this.a[paramInt];
      if (this.d) {
        break label304;
      }
      localCharSequence = null;
      label31:
      iiu localiiu = this.c;
      localFriendLocationsListItemView.b = this.e;
      localFriendLocationsListItemView.c = localiiu;
      localFriendLocationsListItemView.a = localnve.a;
      localFriendLocationsListItemView.d.a(localFriendLocationsListItemView.a, efj.E(localnve.d));
      localFriendLocationsListItemView.e.setText(localnve.c);
      nvv localnvv2 = efj.a(localnve.b);
      if ((localnvv2 == null) || (TextUtils.isEmpty(localnvv2.f))) {
        break label353;
      }
      localFriendLocationsListItemView.f.setText(localnvv2.f);
      label136:
      if (TextUtils.isEmpty(localCharSequence)) {
        break label378;
      }
      localFriendLocationsListItemView.g.setVisibility(0);
      localFriendLocationsListItemView.g.setText(localCharSequence);
      if ((localnve.e != null) && (localnve.e.a != 1) && (localnve.e.a != 0)) {
        break label366;
      }
      localFriendLocationsListItemView.h.setVisibility(8);
    }
    for (;;)
    {
      String str = ((git)mbb.a(localFriendLocationsListItemView.getContext(), git.class)).f().b("gaia_id");
      localFriendLocationsListItemView.i = localFriendLocationsListItemView.a.equals(str);
      if (localFriendLocationsListItemView.i)
      {
        localFriendLocationsListItemView.g.setCompoundDrawables(null, null, null, null);
        localFriendLocationsListItemView.findViewById(eyg.ab).setEnabled(false);
      }
      return localFriendLocationsListItemView;
      localFriendLocationsListItemView = (FriendLocationsListItemView)LayoutInflater.from(this.b).inflate(efj.Od, paramViewGroup, false);
      break;
      label304:
      nvv localnvv1 = efj.a(localnve.b);
      if ((localnvv1 == null) || (localnvv1.d == null))
      {
        localCharSequence = null;
        break label31;
      }
      localCharSequence = lwd.d(this.b, localnvv1.d.longValue());
      break label31;
      label353:
      localFriendLocationsListItemView.f.setText("");
      break label136;
      label366:
      localFriendLocationsListItemView.h.setVisibility(0);
      continue;
      label378:
      localFriendLocationsListItemView.g.setVisibility(8);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iiv
 * JD-Core Version:    0.7.0.1
 */