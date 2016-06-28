import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class gsq
  extends mfh
  implements oyw<gsr>
{
  private gsr Z;
  private gst aa;
  
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
    //   0: invokestatic 22	pea:a	()V
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 32	mfh:a	(Landroid/app/Activity;)V
    //   8: aload_0
    //   9: getfield 34	gsq:Z	Lgsr;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +48 -> 62
    //   17: aload_0
    //   18: aload_1
    //   19: checkcast 36	oyv
    //   22: invokeinterface 39 1 0
    //   27: checkcast 41	oze
    //   30: new 43	ozo
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 46	ozo:<init>	(Lbk;)V
    //   38: invokeinterface 49 2 0
    //   43: checkcast 51	gst
    //   46: putfield 53	gsq:aa	Lgst;
    //   49: aload_0
    //   50: aload_0
    //   51: getfield 53	gsq:aa	Lgst;
    //   54: invokeinterface 57 1 0
    //   59: putfield 34	gsq:Z	Lgsr;
    //   62: invokestatic 27	pea:b	()V
    //   65: return
    //   66: astore 4
    //   68: new 59	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 61
    //   74: aload 4
    //   76: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   79: athrow
    //   80: astore_2
    //   81: invokestatic 27	pea:b	()V
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	gsq
    //   0	86	1	paramActivity	android.app.Activity
    //   80	5	2	localObject	Object
    //   12	2	3	localgsr	gsr
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
    return new ozd(f().getLayoutInflater().getContext(), this.aa).b();
  }
  
  public final Class<gsr> au_()
  {
    return gsr.class;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (this.Z == null) {
      throw new IllegalStateException("peer() called before initialized");
    }
    gsr localgsr = (gsr)this.Z;
    if ((gts.a == gts.a(localgsr.b.b)) || (gts.c == gts.a(localgsr.b.b))) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "BlockingProgressDeleteDialogFragment was only intended to handle String arguments");
      ProgressDialog localProgressDialog = new ProgressDialog(localgsr.a.f());
      localProgressDialog.setIndeterminate(true);
      localProgressDialog.setMessage(localgsr.b.b());
      localProgressDialog.setTitle(localgsr.b.d);
      return localProgressDialog;
    }
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
 * Qualified Name:     gsq
 * JD-Core Version:    0.7.0.1
 */