import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public final class kot
  extends mfh
  implements oyw<kou>
{
  private kou Z;
  private kox aa;
  
  private final kou v()
  {
    if (this.Z == null) {
      throw new IllegalStateException("peer() called before initialized");
    }
    return (kou)this.Z;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    
    View localView1;
    try
    {
      super.a(paramLayoutInflater, paramViewGroup, paramBundle);
      kou localkou = v();
      localView1 = paramLayoutInflater.inflate(efj.Vr, paramViewGroup, false);
      efj.a(localView1, new gxq(pkd.j));
      if (localkou.c.f) {
        localView1.findViewById(efj.Vq).setVisibility(8);
      }
      efj.a(localView1, new kov(localkou));
      View localView2 = localView1.findViewById(efj.Vp);
      efj.a(localView2, new gxq(pkd.k));
      localView2.setOnClickListener(new gxn(peg.a));
      View localView3 = localView1.findViewById(efj.Vo);
      efj.a(localView3, new kvl(pkd.g, 55, null));
      localView3.setOnClickListener(new gxn(peg.a));
      View localView4 = localView1.findViewById(efj.Vq);
      efj.a(localView4, new gxq(pkd.t));
      localView4.setOnClickListener(new gxn(peg.a));
      Context localContext = localkou.a;
      new gwz(-1, new gxr().a(localView1)).b(localContext);
      if (localView1 == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = getClass();
        throw new IllegalStateException(String.format("%s, fragment view is null, but is needed to attach @OnEvent methods in @Peer class.", arrayOfObject));
      }
    }
    finally
    {
      pea.b();
    }
    efj.a(localView1, new kov(v()));
    pea.b();
    return localView1;
  }
  
  /* Error */
  public final void a(android.app.Activity paramActivity)
  {
    // Byte code:
    //   0: invokestatic 35	pea:a	()V
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 167	mfh:a	(Landroid/app/Activity;)V
    //   8: aload_0
    //   9: getfield 20	kot:Z	Lkou;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +48 -> 62
    //   17: aload_0
    //   18: aload_1
    //   19: checkcast 169	oyv
    //   22: invokeinterface 172 1 0
    //   27: checkcast 174	oze
    //   30: new 176	ozo
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 179	ozo:<init>	(Lbk;)V
    //   38: invokeinterface 182 2 0
    //   43: checkcast 184	kox
    //   46: putfield 186	kot:aa	Lkox;
    //   49: aload_0
    //   50: aload_0
    //   51: getfield 186	kot:aa	Lkox;
    //   54: invokeinterface 188 1 0
    //   59: putfield 20	kot:Z	Lkou;
    //   62: invokestatic 162	pea:b	()V
    //   65: return
    //   66: astore 4
    //   68: new 22	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 190
    //   74: aload 4
    //   76: invokespecial 193	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   79: athrow
    //   80: astore_2
    //   81: invokestatic 162	pea:b	()V
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	kot
    //   0	86	1	paramActivity	android.app.Activity
    //   80	5	2	localObject	Object
    //   12	2	3	localkou	kou
    //   66	9	4	localClassCastException	java.lang.ClassCastException
    // Exception table:
    //   from	to	target	type
    //   17	49	66	java/lang/ClassCastException
    //   3	13	80	finally
    //   17	49	80	finally
    //   49	62	80	finally
    //   68	80	80	finally
  }
  
  public final void a(Bundle paramBundle)
  {
    
    try
    {
      super.a(paramBundle);
      kou localkou = v();
      localkou.b.a(1, 0);
      localkou.b.f().getIntent();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final LayoutInflater a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    return new ozd(f().getLayoutInflater().getContext(), this.aa).b();
  }
  
  public final Class<kou> au_()
  {
    return kou.class;
  }
  
  public final void d(Bundle paramBundle)
  {
    
    try
    {
      super.d(paramBundle);
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void d_()
  {
    
    try
    {
      super.d_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void f_()
  {
    
    try
    {
      super.f_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void m()
  {
    
    try
    {
      super.m();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void n()
  {
    
    try
    {
      super.n();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void o()
  {
    
    try
    {
      super.o();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    kou localkou = v();
    if (localkou.b.f() != null) {
      localkou.b.f().finish();
    }
  }
  
  public final void p_()
  {
    
    try
    {
      super.p_();
      kou localkou = v();
      if (localkou.b.d != null)
      {
        Window localWindow = localkou.b.d.getWindow();
        localWindow.setLayout(-1, -2);
        localWindow.setBackgroundDrawableResource(17170443);
        localWindow.setGravity(81);
        localWindow.setWindowAnimations(efj.Vu);
      }
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void q_()
  {
    
    try
    {
      super.q_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kot
 * JD-Core Version:    0.7.0.1
 */