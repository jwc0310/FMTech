import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.AutoBackupBarView;

public final class aox
  implements atq
{
  private final Context a;
  private final int b;
  private final arv<atq> c;
  
  public aox(Context paramContext, int paramInt, arv<atq> paramarv)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramarv;
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.sN, paramViewGroup, false);; localView = paramView)
    {
      AutoBackupBarView localAutoBackupBarView = (AutoBackupBarView)localView;
      if (((hba)mbb.a(paramViewGroup.getContext(), hba.class)).c()) {
        localView.setOnTouchListener(this.c);
      }
      for (;;)
      {
        ((bwn)mbb.a(this.a, bwn.class)).a(paramViewGroup.getContext(), localAutoBackupBarView);
        return localView;
        localView.setOnTouchListener(null);
      }
    }
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aox
 * JD-Core Version:    0.7.0.1
 */