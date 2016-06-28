import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class kgm
  extends mfi
  implements oyw<kgn>
{
  private kgn a;
  private kgv b;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    
    try
    {
      View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
      return localView;
    }
    finally
    {
      pea.b();
    }
  }
  
  /* Error */
  public final void a(android.app.Activity paramActivity)
  {
    // Byte code:
    //   0: invokestatic 21	pea:a	()V
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 30	mfi:a	(Landroid/app/Activity;)V
    //   8: aload_0
    //   9: getfield 32	kgm:a	Lkgn;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +48 -> 62
    //   17: aload_0
    //   18: aload_1
    //   19: checkcast 34	oyv
    //   22: invokeinterface 37 1 0
    //   27: checkcast 39	oze
    //   30: new 41	ozo
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 44	ozo:<init>	(Lbk;)V
    //   38: invokeinterface 47 2 0
    //   43: checkcast 49	kgv
    //   46: putfield 51	kgm:b	Lkgv;
    //   49: aload_0
    //   50: aload_0
    //   51: getfield 51	kgm:b	Lkgv;
    //   54: invokeinterface 55 1 0
    //   59: putfield 32	kgm:a	Lkgn;
    //   62: invokestatic 25	pea:b	()V
    //   65: return
    //   66: astore 4
    //   68: new 57	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 59
    //   74: aload 4
    //   76: invokespecial 62	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   79: athrow
    //   80: astore_2
    //   81: invokestatic 25	pea:b	()V
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	kgm
    //   0	86	1	paramActivity	android.app.Activity
    //   80	5	2	localObject	Object
    //   12	2	3	localkgn	kgn
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
    return new ozd(f().getLayoutInflater().getContext(), this.b).b();
  }
  
  public final Class<kgn> au_()
  {
    return kgn.class;
  }
  
  public final void d(Bundle paramBundle)
  {
    
    try
    {
      super.d(paramBundle);
      if (this.a == null) {
        throw new IllegalStateException("peer() called before initialized");
      }
    }
    finally
    {
      pea.b();
    }
    ((kgn)this.a).a();
    pea.b();
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
  
  public final void p_()
  {
    
    try
    {
      super.p_();
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
 * Qualified Name:     kgm
 * JD-Core Version:    0.7.0.1
 */