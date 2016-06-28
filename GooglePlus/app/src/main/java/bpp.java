import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.plus.collexions.impl.CollectionFollowerListActivity;
import com.google.android.apps.plus.collexions.impl.CollectionStreamActivity;
import com.google.android.apps.plus.collexions.impl.CollexionHomePageActivity;
import com.google.android.apps.plus.collexions.impl.CollexionsFromCirclesActivity;
import com.google.android.apps.plus.collexions.impl.FeaturedCollexionsActivity;
import com.google.android.apps.plus.collexions.impl.UserFollowedCollexionActivity;
import com.google.android.apps.plus.phone.TileCropActivity;
import com.google.android.libraries.social.acl.PlusAclPickerActivity;
import com.google.android.libraries.social.collexions.impl.CollexionEditHeaderActivity;
import com.google.android.libraries.social.collexions.impl.profile.EditFollowedCollexionsVisibilityActivity;
import com.google.android.libraries.social.collexions.impl.share.CreateUpdateCollexionActivity;

public final class bpp
  implements hpo
{
  private final Context a;
  
  public bpp(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt)
  {
    Intent localIntent = new Intent(this.a, CollexionHomePageActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent a(int paramInt, ipf paramipf)
  {
    dbu localdbu = new dbu(this.a, TileCropActivity.class, paramInt);
    localdbu.b = 3;
    localdbu.a = paramipf;
    return localdbu.a();
  }
  
  public final Intent a(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, CollectionFollowerListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("clx_id", paramString);
    return localIntent;
  }
  
  public final Intent a(int paramInt, String paramString1, String paramString2)
  {
    return CollectionStreamActivity.a(this.a, paramInt, null, paramString1, paramString2);
  }
  
  public final Intent a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    return CollectionStreamActivity.a(this.a, paramInt, paramString1, paramString2, paramString3);
  }
  
  public final Intent a(int paramInt, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte, boolean paramBoolean3)
  {
    if (!TextUtils.isEmpty(paramString2))
    {
      hpk localhpk = new hpk(this.a);
      localhpk.a.putExtra("account_id", paramInt);
      localhpk.a.putExtra("clx_activity_id", paramString1);
      localhpk.a.putExtra("restrict_to_domain", paramBoolean1);
      localhpk.a.putExtra("fromCollexionId", paramString2);
      return localhpk.a;
    }
    hpj localhpj = new hpj(this.a);
    localhpj.a.putExtra("account_id", paramInt);
    localhpj.a.putExtra("clx_activity_id", paramString1);
    localhpj.a.putExtra("is_limited", false);
    localhpj.a.putExtra("from_collexion_id", paramString2);
    localhpj.a.putExtra("promoted_post_data", null);
    localhpj.a.putExtra("restrict_to_domain", paramBoolean1);
    localhpj.a.putExtra("show_reshare_shortcut", false);
    return localhpj.a;
  }
  
  public final Intent a(int paramInt, String paramString, boolean paramBoolean)
  {
    Intent localIntent = new Intent(this.a, UserFollowedCollexionActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("clx_gaiaId", paramString);
    localIntent.putExtra("disableViewCollexionsFromCircles", true);
    return localIntent;
  }
  
  public final Intent a(int paramInt, String paramString, boolean paramBoolean1, byte[] paramArrayOfByte, boolean paramBoolean2)
  {
    dgs localdgs = new dgs(this.a);
    localdgs.a.setAction("android.intent.action.SEND");
    localdgs.a.putExtra("account_id", paramInt);
    localdgs.a.putExtra("activity_id", null);
    localdgs.a.putExtra("promoted_post_data", paramArrayOfByte);
    return localdgs.a(paramBoolean1).b(paramBoolean2).a;
  }
  
  public final Intent a(Context paramContext, int paramInt, String paramString)
  {
    hol localhol = new hol(paramContext);
    localhol.a.putExtra("account_id", paramInt);
    localhol.a.putExtra("query", paramString);
    return localhol.a;
  }
  
  public final Intent a(Intent paramIntent)
  {
    Intent localIntent = new Intent(paramIntent);
    localIntent.setClass(this.a, hpi.class);
    return localIntent;
  }
  
  public final Intent a(Bundle paramBundle, int paramInt)
  {
    return CreateUpdateCollexionActivity.a(this.a, paramBundle, paramInt);
  }
  
  public final Intent a(String paramString1, String paramString2, String paramString3, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return new Intent(this.a, CreateUpdateCollexionActivity.class).putExtra("clx_id", paramString1).putExtra("clx_name", paramString2).putExtra("clx_tagline", paramString3).putExtra("account_id", paramInt1).putExtra("clx_autofollow_state", paramBoolean).putExtra("clx_visibility_type", paramInt2);
  }
  
  public final Intent a(boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, gnb paramgnb)
  {
    gnv localgnv = new gnv(this.a);
    localgnv.a.putExtra("acl.PlusAclPickerActivity.RESTRICT_TO_DOMAIN", paramBoolean2);
    localgnv.a.putExtra("account_id", paramInt);
    localgnv.a.putExtra("acl.PlusAclPickerActivity.DISABLE_DOMAIN_RESTRICTION_TOGGLE", true);
    if (paramBoolean4) {}
    for (int i = 10;; i = 16)
    {
      localgnv.a.putExtra("circle_usage_type", i);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.ALLOW_EMPTY_AUDIENCE", false);
      localgnv.a.putExtra("is_limited", paramBoolean4);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.FILTER_NULL_GAIA_IDS", true);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.INCLUDE_PLUS_PAGES", true);
      if (paramgnb != null) {
        localgnv.a(paramgnb.d(), PlusAclPickerActivity.a(paramgnb));
      }
      localgnv.a(2);
      return localgnv.a;
    }
  }
  
  public final Intent b(int paramInt)
  {
    boolean bool1 = true;
    Context localContext = this.a;
    hhj localhhj = (hhj)mbb.b(localContext, hhj.class);
    boolean bool2;
    hhg localhhg;
    if ((localhhj != null) && (localhhj.a))
    {
      bool2 = bool1;
      localhhg = new hhg();
      localhhg.a.putBoolean("allowPrivate", bool1);
      localhhg.a.putBoolean("allowDomain", bool1);
      if (bool2) {
        break label98;
      }
    }
    for (;;)
    {
      localhhg.a.putBoolean("allowPublic", bool1);
      return CreateUpdateCollexionActivity.a(localContext, localhhg.a, paramInt);
      bool2 = false;
      break;
      label98:
      bool1 = false;
    }
  }
  
  public final Intent b(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, CollexionEditHeaderActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("clx_id", paramString);
    return localIntent;
  }
  
  public final Intent c(int paramInt)
  {
    return ((iea)mbb.a(this.a, iea.class)).a().a(hpn.class).a(hpl.class).a(hpm.class).a(paramInt);
  }
  
  public final Intent c(int paramInt, String paramString)
  {
    return efj.a(this.a, paramInt, paramString, null, false);
  }
  
  public final Intent d(int paramInt)
  {
    Intent localIntent = new Intent(this.a, CollexionsFromCirclesActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent e(int paramInt)
  {
    Intent localIntent = new Intent(this.a, EditFollowedCollexionsVisibilityActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent f(int paramInt)
  {
    Intent localIntent = new Intent(this.a, FeaturedCollexionsActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpp
 * JD-Core Version:    0.7.0.1
 */