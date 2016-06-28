import android.content.Context;
import android.database.Cursor;
import android.os.ConditionVariable;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jkz
  implements jiw, jix
{
  Context a;
  private SparseArray<jkg> b;
  private fym c;
  private fzb d;
  private fyy e;
  
  public jkz(Context paramContext)
  {
    this.a = paramContext;
    this.c = ((fym)mbb.a(paramContext, fym.class));
    this.d = ((fzb)mbb.a(paramContext, fzb.class));
    this.e = this.c.a();
    this.b = new SparseArray();
    new jka(paramContext);
  }
  
  public jkz(Context paramContext, mek parammek)
  {
    this(paramContext);
    parammek.a(this);
  }
  
  static String a(fzl paramfzl)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; (paramfzl != null) && (i < paramfzl.b()); i++)
    {
      fzk localfzk = (fzk)paramfzl.a(i);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localfzk.b();
      localStringBuilder.append(String.format("%s, ", arrayOfObject));
    }
    return localStringBuilder.toString();
  }
  
  public final Cursor a(int paramInt1, int paramInt2)
  {
    return new jlz(a(paramInt1, efj.j(paramInt2)));
  }
  
  public final List<jjg> a(int paramInt1, int paramInt2, jjm<jjg> paramjjm)
  {
    ArrayList localArrayList = new ArrayList();
    ConditionVariable localConditionVariable = new ConditionVariable();
    a(new jld(this, localArrayList, localConditionVariable), paramInt1, paramInt2, 2147483647, paramjjm);
    localConditionVariable.block(5000L);
    for (;;)
    {
      try
      {
        if (localArrayList.isEmpty())
        {
          localObject2 = Collections.EMPTY_LIST;
          return localObject2;
        }
      }
      finally {}
      Object localObject2 = localArrayList;
    }
  }
  
  public final List<jgw> a(int paramInt, jjm<jgw> paramjjm)
  {
    ArrayList localArrayList = new ArrayList();
    ConditionVariable localConditionVariable = new ConditionVariable();
    a(new jla(this, localArrayList, localConditionVariable), paramInt, paramjjm);
    localConditionVariable.block(5000L);
    for (;;)
    {
      try
      {
        if (localArrayList.isEmpty())
        {
          localObject2 = Collections.EMPTY_LIST;
          return localObject2;
        }
      }
      finally {}
      Object localObject2 = localArrayList;
    }
  }
  
  final jkg a(int paramInt)
  {
    try
    {
      jkg localjkg = (jkg)this.b.get(paramInt);
      if (localjkg == null)
      {
        localjkg = new jkg(this.a, paramInt);
        this.b.put(paramInt, localjkg);
      }
      return localjkg;
    }
    finally {}
  }
  
  public final void a()
  {
    this.e.c();
  }
  
  public final void a(jhw paramjhw, int paramInt, jjm<jgw> paramjjm)
  {
    jkg localjkg = a(paramInt);
    localjkg.a(new jkk(this.a, localjkg, paramjhw, paramjjm));
  }
  
  public final void a(jhx paramjhx, int paramInt1, int paramInt2, int paramInt3, jjm<jjg> paramjjm)
  {
    jkg localjkg = a(paramInt1);
    localjkg.a(new jlm(this.a, localjkg, paramjhx, paramInt2, paramInt3, paramjjm));
  }
  
  public final void a(jhy paramjhy, int paramInt1, int paramInt2, jjm<jgw> paramjjm)
  {
    jkg localjkg = a(paramInt1);
    localjkg.a(new jlu(this.a, localjkg, paramjhy, paramInt2, paramjjm));
  }
  
  public final void a(jib paramjib, int paramInt1, String paramString1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (jid.a()) {
      jid.a("MenageriePeopleService#loadCircles", String.format("circleId: %s.", new Object[] { null }));
    }
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt1);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    fyp localfyp = new fyp();
    localfyp.b = null;
    localfyp.a = -999;
    localfyp.c = null;
    localfyp.d = false;
    fsg localfsg = this.c.a(this.e, str1, str2, localfyp);
    if (paramBoolean2)
    {
      fyq localfyq = (fyq)localfsg.a();
      fzl localfzl = localfyq.a();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(localfyq.aN_().a());
      arrayOfObject[1] = a(localfzl);
      jid.a("MenageriePeopleService#loadCircles", String.format("isSuccess: %s. %s", arrayOfObject));
      jid.a(this.a, str1, 3, localfyq);
      paramjib.a(localfzl);
      return;
    }
    localfsg.a(new jle(this, str1, paramjib));
  }
  
  public final void a(jic paramjic, int paramInt, boolean paramBoolean)
  {
    if (jid.a())
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(paramBoolean);
      jid.a("MenageriePeopleService#loadPeople", String.format("waitUntilComplete: %s", arrayOfObject2));
    }
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    fyt localfyt = jjo.a.a();
    fsg localfsg = this.c.a(this.e, str1, str2, localfyt);
    if (paramBoolean)
    {
      fyu localfyu = (fyu)localfsg.a();
      fzl localfzl = localfyu.a();
      if ((jid.a()) && (localfzl != null))
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Boolean.valueOf(localfyu.aN_().a());
        arrayOfObject1[1] = Integer.valueOf(localfzl.b());
        jid.a("MenageriePeopleService#loadPeople", String.format("isSuccess: %s. People count: %s", arrayOfObject1));
      }
      jid.a(this.a, str1, 4, localfyu);
      paramjic.a(localfzl);
      return;
    }
    localfsg.a(new jlf(this, str1, paramjic));
  }
  
  public final void a(jjn paramjjn, int paramInt, jjo paramjjo)
  {
    if (paramjjn == null) {
      throw new IllegalArgumentException("listener cannot be null.");
    }
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    fyt localfyt = paramjjo.a();
    this.c.a(this.e, str1, str2, localfyt).a(new jlc(this, paramjjn, paramInt));
  }
  
  public final void a(jjp paramjjp, int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    try
    {
      fsg localfsg2 = this.d.a(this.e, str1, str2);
      localfsg1 = localfsg2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      fsg localfsg1;
      for (;;)
      {
        String str3 = String.valueOf(localIllegalArgumentException);
        jid.a("MenageriePeopleService#requestSyncByUserAction", 54 + String.valueOf(str3).length() + "Unexpected error when requesting sync by user action: " + str3);
        localfsg1 = null;
      }
      localfsg1.a(new jlg(this, str1, paramjjp));
    }
    if (localfsg1 == null)
    {
      if (jid.a()) {
        jid.a("MenageriePeopleService#requestSyncByUserAction", "GMS requestSyncByUserAction return null pendingResult.");
      }
      paramjjp.a();
      return;
    }
  }
  
  public final void a(jjq paramjjq, int paramInt, long paramLong, boolean paramBoolean)
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    try
    {
      fsg localfsg2 = this.d.a(this.e, str1, str2, 28800L, false);
      localfsg1 = localfsg2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      fsg localfsg1;
      for (;;)
      {
        String str3 = String.valueOf(localIllegalArgumentException);
        jid.a("MenageriePeopleService#requestSync", 39 + String.valueOf(str3).length() + "Unexpected error when requesting sync: " + str3);
        localfsg1 = null;
      }
      localfsg1.a(new jlh(this, str1, paramjjq));
    }
    if (localfsg1 == null)
    {
      if (jid.a()) {
        jid.a("MenageriePeopleService#requestSync", "GMS requestSync return null pendingResult.");
      }
      paramjjq.a(null);
      return;
    }
  }
  
  public final void aK_()
  {
    this.e.d();
  }
  
  public final List<Pair<jgw, List<jjg>>> b(int paramInt1, int paramInt2, jjm<jgw> paramjjm)
  {
    ArrayList localArrayList = new ArrayList();
    ConditionVariable localConditionVariable = new ConditionVariable();
    a(new jlb(this, localArrayList, localConditionVariable), paramInt1, paramInt2, paramjjm);
    localConditionVariable.block(5000L);
    for (;;)
    {
      try
      {
        if (localArrayList.isEmpty())
        {
          localObject2 = Collections.EMPTY_LIST;
          return localObject2;
        }
      }
      finally {}
      Object localObject2 = localArrayList;
    }
  }
  
  public final jix c()
  {
    return this;
  }
  
  public final void d()
  {
    this.e.c();
  }
  
  public final void e()
  {
    this.e.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkz
 * JD-Core Version:    0.7.0.1
 */