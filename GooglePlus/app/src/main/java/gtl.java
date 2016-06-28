import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public final class gtl
  extends mfh
  implements oyw<gtm>
{
  private gtm Z;
  private gto aa;
  
  private final gtm v()
  {
    if (this.Z == null) {
      throw new IllegalStateException("peer() called before initialized");
    }
    return (gtm)this.Z;
  }
  
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
    //   0: invokestatic 35	pea:a	()V
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 45	mfh:a	(Landroid/app/Activity;)V
    //   8: aload_0
    //   9: getfield 20	gtl:Z	Lgtm;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +48 -> 62
    //   17: aload_0
    //   18: aload_1
    //   19: checkcast 47	oyv
    //   22: invokeinterface 50 1 0
    //   27: checkcast 52	oze
    //   30: new 54	ozo
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 57	ozo:<init>	(Lbk;)V
    //   38: invokeinterface 60 2 0
    //   43: checkcast 62	gto
    //   46: putfield 64	gtl:aa	Lgto;
    //   49: aload_0
    //   50: aload_0
    //   51: getfield 64	gtl:aa	Lgto;
    //   54: invokeinterface 67 1 0
    //   59: putfield 20	gtl:Z	Lgtm;
    //   62: invokestatic 40	pea:b	()V
    //   65: return
    //   66: astore 4
    //   68: new 22	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 69
    //   74: aload 4
    //   76: invokespecial 72	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   79: athrow
    //   80: astore_2
    //   81: invokestatic 40	pea:b	()V
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	gtl
    //   0	86	1	paramActivity	android.app.Activity
    //   80	5	2	localObject	Object
    //   12	2	3	localgtm	gtm
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
  
  public final Class<gtm> au_()
  {
    return gtm.class;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    super.c(paramBundle);
    gtm localgtm = v();
    Object localObject1;
    if (gts.a == gts.a(localgtm.b.b)) {
      localObject1 = localgtm.b.b();
    }
    for (;;)
    {
      un localun = new un(localgtm.a.f());
      String str = localgtm.b.d;
      localun.a.e = str;
      localun.a.g = ((CharSequence)localObject1);
      return localun.a(localgtm.b.e, null).a();
      gts localgts1 = gts.b;
      gts localgts2 = gts.a(localgtm.b.b);
      localObject1 = null;
      if (localgts1 == localgts2)
      {
        ics localics = localgtm.c;
        rbr localrbr = localgtm.b.c();
        if ((0x1 & localrbr.a) == 1) {}
        for (int i = 1;; i = 0)
        {
          if (i != 0) {
            break label171;
          }
          localObject1 = null;
          break;
        }
        label171:
        icx localicx1;
        label200:
        icv localicv1;
        qpg localqpg;
        icv localicv2;
        if (localrbr.c() == rbt.a)
        {
          localicx1 = (icx)localics.a.e.a();
          localicv1 = localics.a;
          localqpg = localrbr.b();
          localicv2 = localics.a;
          if (0 != 0) {
            break label335;
          }
        }
        icx localicx2;
        icx localicx3;
        icx localicx4;
        icx localicx5;
        label335:
        for (Object localObject2 = (icx)localicv2.c.a();; localObject2 = new icw(localicv2, null))
        {
          localicx2 = (icx)localics.a.f.a();
          localicx3 = (icx)localicv1.a.a();
          localicx4 = (icx)localicv1.b.a();
          localicx5 = (icx)localicv1.g.a();
          if (localqpg != null) {
            break label350;
          }
          localObject1 = null;
          break;
          localicx1 = (icx)localics.a.d.a();
          break label200;
        }
        label350:
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
        int j = localqpg.a.size();
        int k = 0;
        if (k < j)
        {
          qpa localqpa = (qpa)localqpg.a.get(k);
          int m = localSpannableStringBuilder.length();
          qpe localqpe = localqpa.o();
          if ((localqpe == qpe.c) && (localqpa.q() != null) && (localObject2 != null)) {
            ((icx)localObject2).a(localSpannableStringBuilder, m, localqpa);
          }
          for (;;)
          {
            if ((localqpa.p() != null) && (localicx5 != null)) {
              localicx5.a(localSpannableStringBuilder, m, localqpa);
            }
            k++;
            break;
            if ((localqpe == qpe.d) && (localicx1 != null)) {
              localicx1.a(localSpannableStringBuilder, m, localqpa);
            } else if ((localqpe == qpe.e) && (localqpa.s() != null) && (localicx2 != null) && (!TextUtils.isEmpty(localqpa.s().a))) {
              localicx2.a(localSpannableStringBuilder, m, localqpa);
            } else if ((localqpe == qpe.b) && (localicx3 != null)) {
              localicx3.a(localSpannableStringBuilder, m, localqpa);
            } else if (localicx4 != null) {
              localicx4.a(localSpannableStringBuilder, m, localqpa);
            }
          }
        }
        localObject1 = localSpannableStringBuilder;
      }
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
      Dialog localDialog = v().a.d;
      if (localDialog != null) {
        ((TextView)localDialog.findViewById(16908299)).setMovementMethod(lxy.a());
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
 * Qualified Name:     gtl
 * JD-Core Version:    0.7.0.1
 */