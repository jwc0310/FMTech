import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class inx
  implements ilq
{
  private mtu a;
  private Set<inj> b;
  
  inx(inw paraminw) {}
  
  public final int a(gje paramgje)
  {
    int i = 1;
    int k = 0;
    oan localoan = this.a.a;
    oap localoap = localoan.b;
    gje localgje1 = paramgje.c("gaia_id", localoap.c.a).c("is_plus_page", efj.b(localoap.b)).c("display_name", localoap.c.c).c("given_name", localoap.c.h).c("family_name", localoap.c.i).c("domain_name", localoap.c.f);
    if (!TextUtils.isEmpty(localoap.c.f))
    {
      int m = i;
      gje localgje2 = localgje1.c("is_dasher_account", m).c("is_child", efj.b(localoap.a));
      if (localoan.d != 2) {
        break label300;
      }
      int i1 = i;
      label170:
      localgje2.c("is_default_restricted", i1).c("email_gaia_id", localoap.c.b);
      if (!efj.b(localoap.c.e)) {
        break label306;
      }
      paramgje.i("profile_photo_url");
    }
    for (;;)
    {
      int i3 = paramgje.a("page_count", 0);
      for (int i4 = 0; i4 < i3; i4++) {
        paramgje.h("page").h(Integer.toString(i4)).i("gaia_id").i("display_name").i("avatar_url").i("email_gaia_id");
      }
      int n = 0;
      break;
      label300:
      int i2 = 0;
      break label170;
      label306:
      paramgje.c("profile_photo_url", efj.E(localoap.c.d));
    }
    if (localoap.d == null) {}
    for (int i5 = 0;; i5 = localoap.d.length) {
      for (int i6 = 0; i6 < i5; i6++)
      {
        oaq localoaq = localoap.d[i6];
        paramgje.h("page").h(Integer.toString(i6)).c("gaia_id", localoaq.a).c("display_name", localoaq.c).c("avatar_url", efj.E(localoaq.d)).c("email_gaia_id", localoaq.b);
      }
    }
    paramgje.c("page_count", i5);
    int i7;
    int i9;
    label484:
    int i11;
    if (!efj.b(localoap.e))
    {
      i7 = i;
      if (localoan.a != i) {
        break label650;
      }
      i9 = i;
      if ((i7 != 0) || (i5 <= 0)) {
        break label656;
      }
      i11 = i;
      label497:
      if ((i7 == 0) || (i9 != 0)) {
        break label662;
      }
      int i13 = i;
      label510:
      paramgje.c("is_google_plus", i13);
      if ((i7 == 0) || (i9 == 0)) {
        break label668;
      }
    }
    for (;;)
    {
      paramgje.c("gplus_no_mobile_tos", i);
      paramgje.c("gplus_skinny_page", i11);
      paramgje.c("PlusiAccountUpdateExtension.oob_required", i9);
      paramgje.c("PlusiAccountUpdateExtension.wants_full_update", i7);
      int i15 = this.c.b.size();
      while (k < i15)
      {
        inj localinj = (inj)this.c.b.get(k);
        if (this.b.contains(localinj)) {
          localinj.a(paramgje, this.a);
        }
        k++;
      }
      int i8 = 0;
      break;
      label650:
      int i10 = 0;
      break label484;
      label656:
      int i12 = 0;
      break label497;
      label662:
      int i14 = 0;
      break label510;
      label668:
      int j = 0;
    }
    return ilr.a;
  }
  
  public final void a(gjb paramgjb, kcg paramkcg, List<kbw> paramList)
  {
    mtt localmtt = new mtt();
    localmtt.a = new oak();
    localmtt.a.a = Boolean.valueOf(true);
    localmtt.a.d = Boolean.valueOf(true);
    this.b = new HashSet();
    int i = this.c.b.size();
    for (int j = 0; j < i; j++)
    {
      inj localinj = (inj)this.c.b.get(j);
      localinj.a(paramgjb, localmtt);
      this.b.add(localinj);
    }
    this.a = new mtu();
    paramList.add(new iny(this, this.c.a, paramkcg, "getmobilesettings", localmtt, this.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     inx
 * JD-Core Version:    0.7.0.1
 */