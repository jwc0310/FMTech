import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.spaces.SpaceListItemView;

public final class bpc
  implements bot
{
  private final Context a;
  private final hha b;
  private final kxq c;
  private final loj d;
  
  public bpc(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((hha)mbb.a(paramContext, hha.class));
    this.c = ((kxq)mbb.a(paramContext, kxq.class));
    this.d = loj.a(paramContext);
  }
  
  private final Uri b(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return ((hho)mbb.a(this.a, hho.class)).d();
    }
    return ((hho)mbb.a(this.a, hho.class)).b(paramString);
  }
  
  public final int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(37 + "Unknown profile item type " + paramInt);
    }
    return aau.wl;
  }
  
  public final int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return ehr.j;
    }
    return ehr.i;
  }
  
  public final bk a()
  {
    return new bpk();
  }
  
  public final SpaceListItemView a(Context paramContext, ViewGroup paramViewGroup)
  {
    return this.c.b(paramContext, paramViewGroup);
  }
  
  public final hgv a(bk parambk, mek parammek)
  {
    return new hjl(parambk, parammek);
  }
  
  public final hhp a(mek parammek)
  {
    return new hph(parammek, false);
  }
  
  public final void a(int paramInt, String paramString)
  {
    hlk.a(this.a, null, true, paramInt, paramString, null);
  }
  
  public final void a(int paramInt, boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      hlj.a(this.a, null, paramInt);
      return;
    }
    hll.a(this.a, null, paramInt, paramString);
  }
  
  public final void a(View paramView, Cursor paramCursor, int paramInt, hgz paramhgz)
  {
    this.b.a((SpaceListItemView)paramView, paramCursor, paramInt, paramhgz);
  }
  
  public final void a(boolean paramBoolean, String paramString, hhm paramhhm)
  {
    Uri localUri = b(paramBoolean, paramString);
    ((hhn)mbb.a(this.a, hhn.class)).a(localUri, paramhhm);
  }
  
  public final boolean a(String paramString)
  {
    return "UpdateFollowStateBackgroundTask".equals(paramString);
  }
  
  public final boolean a(boolean paramBoolean, int paramInt)
  {
    return (paramBoolean) && (((hot)mbb.a(this.a, hot.class)).b(paramInt));
  }
  
  public final boolean a(boolean paramBoolean, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    Uri localUri = b(paramBoolean, paramString);
    return ((hhn)mbb.a(this.a, hhn.class)).a(localUri) == 1;
  }
  
  public final hgx b(bk parambk, mek parammek)
  {
    return new hhq(parambk, parammek);
  }
  
  public final String b()
  {
    return this.a.getResources().getString(ehr.s);
  }
  
  public final String b(String paramString)
  {
    Context localContext = this.a;
    int i = ehr.r;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.d.a.a(paramString);
    return localContext.getString(i, arrayOfObject);
  }
  
  public final void b(boolean paramBoolean, String paramString, hhm paramhhm)
  {
    Uri localUri = b(paramBoolean, paramString);
    ((hhn)mbb.a(this.a, hhn.class)).b(localUri, paramhhm);
  }
  
  public final int c()
  {
    return aau.wc;
  }
  
  public final int d()
  {
    return this.a.getResources().getDimensionPixelSize(aau.vZ);
  }
  
  public final int e()
  {
    return aau.wk;
  }
  
  public final String f()
  {
    return this.a.getString(ehr.w);
  }
  
  public final bk g()
  {
    return hiy.a(efj.zx, true);
  }
  
  public final bk h()
  {
    return boy.a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpc
 * JD-Core Version:    0.7.0.1
 */