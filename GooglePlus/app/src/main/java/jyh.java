import android.text.TextUtils;

final class jyh
  implements iuu
{
  private static final int a = qti.a.b >>> 3;
  private static final int b = qtk.a.b >>> 3;
  private static final int c = quk.a.b >>> 3;
  private static final int d = qtb.a.b >>> 3;
  private static final int e = qtc.a.b >>> 3;
  private static final int f = qtg.a.b >>> 3;
  private static final int g = qth.a.b >>> 3;
  
  public final void a(gjb paramgjb, kcx paramkcx)
  {
    String str = paramgjb.b("effective_gaia_id");
    if (str == null) {
      str = paramgjb.b("gaia_id");
    }
    qao localqao1 = qti.a;
    qti localqti = new qti();
    localqti.b = str;
    paramkcx.a(localqao1, localqti, a);
    qao localqao2 = qtk.a;
    qtk localqtk = new qtk();
    localqtk.b = str;
    paramkcx.a(localqao2, localqtk, b);
    qao localqao3 = quk.a;
    quk localquk = new quk();
    localquk.b = Boolean.valueOf(false);
    paramkcx.a(localqao3, localquk, c);
    qao localqao4 = qtb.a;
    int i = d;
    paramkcx.a(kcx.a(localqao4), null, i);
    qao localqao5 = qtc.a;
    int j = e;
    paramkcx.a(kcx.a(localqao5), null, j);
    qao localqao6 = qtg.a;
    int k = f;
    paramkcx.a(kcx.a(localqao6), null, k);
    qao localqao7 = qth.a;
    int m = g;
    paramkcx.a(kcx.a(localqao7), null, m);
  }
  
  public final void a(gje paramgje, kcx paramkcx)
  {
    boolean bool1 = true;
    int i = 0;
    int j = paramkcx.a(a);
    int k = paramkcx.a(b);
    int m = paramkcx.a(c);
    int n = paramkcx.a(d);
    int i1 = paramkcx.a(e);
    int i2 = paramkcx.a(f);
    int i3 = paramkcx.a(g);
    qtj localqtj = (qtj)paramkcx.a(j, qtj.a);
    qtl localqtl = (qtl)paramkcx.a(k, qtl.a);
    qul localqul = (qul)paramkcx.a(m, qul.a);
    qtb localqtb = (qtb)paramkcx.a(n, qtb.a);
    qtc localqtc = (qtc)paramkcx.a(i1, qtc.a);
    qtg localqtg = (qtg)paramkcx.a(i2, qtg.a);
    qth localqth = (qth)paramkcx.a(i3, qth.a);
    int i4;
    boolean bool2;
    boolean bool3;
    label201:
    boolean bool4;
    label214:
    boolean bool5;
    label320:
    boolean bool6;
    label391:
    gje localgje3;
    if (localqth.b == null)
    {
      i4 = 0;
      bool2 = efj.b(localqul.b);
      if (efj.b(localqul.c)) {
        break label544;
      }
      bool3 = bool1;
      if ((bool2) || (i4 <= 0)) {
        break label550;
      }
      bool4 = bool1;
      String str = paramgje.b("effective_gaia_id");
      if (str != null) {
        paramgje.c("gaia_id", str);
      }
      gje localgje1 = paramgje.c("is_plus_page", localqtg.b.booleanValue()).c("display_name", localqtj.d).c("given_name", localqtj.b).c("family_name", localqtj.c).c("domain_name", localqtb.b);
      if (TextUtils.isEmpty(localqtb.b)) {
        break label556;
      }
      bool5 = bool1;
      gje localgje2 = localgje1.c("is_dasher_account", bool5).c("is_child", localqtc.b.booleanValue()).c("is_default_restricted", efj.b(localqtb.c)).c("profile_photo_url", efj.E(localqtl.b));
      if ((!bool2) || (bool3)) {
        break label562;
      }
      bool6 = bool1;
      localgje3 = localgje2.c("is_google_plus", bool6);
      if ((!bool2) || (!bool3)) {
        break label568;
      }
    }
    qtd[] arrayOfqtd;
    for (;;)
    {
      localgje3.c("gplus_no_mobile_tos", bool1).c("gplus_skinny_page", bool4).c("PlusiAccountUpdateExtension.oob_required", bool3).c("PlusiAccountUpdateExtension.wants_full_update", bool2);
      arrayOfqtd = localqth.b;
      int i5 = paramgje.a("page_count", 0);
      for (int i6 = 0; i6 < i5; i6++) {
        paramgje.h("page").h(Integer.toString(i6)).i("gaia_id").i("display_name").i("avatar_url").i("email_gaia_id");
      }
      i4 = localqth.b.length;
      break;
      label544:
      bool3 = false;
      break label201;
      label550:
      bool4 = false;
      break label214;
      label556:
      bool5 = false;
      break label320;
      label562:
      bool6 = false;
      break label391;
      label568:
      bool1 = false;
    }
    int i7;
    if (arrayOfqtd == null) {
      i7 = 0;
    }
    while (i < i7)
    {
      qtd localqtd = arrayOfqtd[i];
      paramgje.h("page").h(Integer.toString(i)).c("gaia_id", localqtd.a).c("display_name", localqtd.b).c("avatar_url", efj.E(localqtd.c));
      i++;
      continue;
      i7 = arrayOfqtd.length;
      i = 0;
    }
    paramgje.c("page_count", i7);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyh
 * JD-Core Version:    0.7.0.1
 */