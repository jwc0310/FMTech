import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.photoeditor.views.ItemSelectorView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

public final class alm
  extends bk
{
  final ToolButton[] Z = new ToolButton[3];
  TextView a;
  aln aa;
  private View ab;
  TextView b;
  public ItemSelectorView c;
  int d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ab = paramLayoutInflater.inflate(efj.gj, paramViewGroup, false);
    if (this.ab == null) {
      throw new IllegalStateException("Failed to inflate the parameter panel fragment");
    }
    this.a = ((TextView)this.ab.findViewById(efj.fT));
    this.b = ((TextView)this.ab.findViewById(efj.fU));
    this.c = ((ItemSelectorView)this.ab.findViewById(efj.fO));
    this.Z[0] = ((ToolButton)this.ab.findViewById(efj.fH));
    this.Z[1] = ((ToolButton)this.ab.findViewById(efj.gc));
    this.Z[2] = ((ToolButton)this.ab.findViewById(efj.ge));
    return this.ab;
  }
  
  public final ToolButton a(int paramInt1, int paramInt2, int paramInt3, String paramString, View.OnClickListener paramOnClickListener)
  {
    if (this.d >= this.Z.length) {
      throw new IllegalStateException("There are no available tool button slots");
    }
    ToolButton[] arrayOfToolButton = this.Z;
    int i = this.d;
    this.d = (i + 1);
    ToolButton localToolButton = arrayOfToolButton[i];
    localToolButton.a(paramInt1, paramInt2, 0);
    localToolButton.a(paramString);
    localToolButton.setEnabled(true);
    localToolButton.setOnClickListener(paramOnClickListener);
    localToolButton.setVisibility(0);
    return localToolButton;
  }
  
  public final void m()
  {
    super.m();
    v();
  }
  
  public final boolean v()
  {
    if ((this.ab == null) || (this.aa == null)) {
      return false;
    }
    this.aa.Q();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alm
 * JD-Core Version:    0.7.0.1
 */