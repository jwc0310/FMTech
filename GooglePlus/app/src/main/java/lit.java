import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;

public final class lit
  extends mby
  implements DialogInterface.OnClickListener, cw<Cursor>, gxs
{
  private static final String[] aa = { "volume", "square_name" };
  private static final SparseIntArray ab;
  private TextView Z;
  private git ac;
  private String ag;
  private int ah;
  private ViewAnimator ai;
  private RadioGroup aj;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    ab = localSparseIntArray;
    localSparseIntArray.put(0, efj.YL);
    ab.put(1, efj.YJ);
    ab.put(2, efj.YM);
    ab.put(3, efj.YK);
  }
  
  public lit()
  {
    new gxj(this.af, (byte)0);
    this.ah = -1;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new lii(this.ad, this.ac.c(), this.ag, aa);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ag = this.m.getString("square_id");
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun = new un(this.ad);
    View localView = LayoutInflater.from(this.ad).inflate(efj.YN, null, false);
    this.ai = ((ViewAnimator)localView.findViewById(efj.YI));
    this.aj = ((RadioGroup)localView.findViewById(efj.YH));
    this.Z = new TextView(this.ad);
    int i = this.ai.getPaddingLeft();
    this.Z.setPadding(i, i, i, i);
    this.Z.setTextAppearance(this.ad, aaw.qG);
    TextView localTextView = this.Z;
    localun.a.f = localTextView;
    localun.a(localView);
    localun.a(fh.f, this);
    localun.b(fh.a, this);
    return localun.a();
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.ac = ((git)this.ae.a(git.class));
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      int i = this.aj.getCheckedRadioButtonId();
      if (i != -1)
      {
        int j = ab.indexOfValue(i);
        if (this.ah != j) {
          ((liv)this.ae.a(liv.class)).a(this.ag, j);
        }
      }
    }
    a(false);
  }
  
  public final void p_()
  {
    super.p_();
    ((um)this.d).a(-1).setEnabled(false);
    k().a(1, null, this);
  }
  
  public final gxq v()
  {
    return new kuw(pjo.aV, this.ag);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lit
 * JD-Core Version:    0.7.0.1
 */