import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.photos.views.CollectionListHeaderView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class aro
  implements atq
{
  final arh a;
  private final int b;
  private final LayoutInflater c;
  
  public aro(Context paramContext, arh paramarh, int paramInt)
  {
    this.c = LayoutInflater.from(paramContext);
    this.a = paramarh;
    this.b = 0;
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (View localView = this.c.inflate(efj.sR, paramViewGroup, false);; localView = paramView)
    {
      CollectionListHeaderView localCollectionListHeaderView = (CollectionListHeaderView)localView;
      arq localarq = (arq)mbb.a(localView.getContext(), arq.class);
      arh localarh = this.a;
      localCollectionListHeaderView.b = localarh;
      localCollectionListHeaderView.c = this;
      localCollectionListHeaderView.a = localarq;
      ((TextView)localCollectionListHeaderView.findViewById(aaw.bA)).setText(localarh.b);
      localCollectionListHeaderView.a();
      AvatarView localAvatarView = (AvatarView)localCollectionListHeaderView.findViewById(aaw.as);
      if ((!TextUtils.isEmpty(localarh.e)) && (!TextUtils.isEmpty(localarh.f)))
      {
        localAvatarView.a(localarh.e, localarh.f);
        localAvatarView.setVisibility(0);
        localAvatarView.setClickable(true);
        localAvatarView.setOnClickListener(new bft(localCollectionListHeaderView, localarh));
      }
      for (;;)
      {
        localView.setOnClickListener(new arp(this, localarq));
        return localView;
        localAvatarView.setVisibility(8);
      }
    }
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aro
 * JD-Core Version:    0.7.0.1
 */