import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.photoeditor.ui.views.CropImageView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

public final class ajp
  extends mca
{
  private View Z;
  public View a;
  public CropImageView b;
  public ajs c;
  private final ToolButton[] d = new ToolButton[3];
  
  private final float v()
  {
    Intent localIntent = f().getIntent();
    int i = localIntent.getIntExtra("aspectX", 0);
    int j = localIntent.getIntExtra("aspectY", 0);
    if ((i == 0) || (j == 0))
    {
      i = localIntent.getIntExtra("outputX", 0);
      j = localIntent.getIntExtra("outputY", 0);
    }
    if ((i > 0) && (j > 0)) {
      return i / j;
    }
    return 0.0F;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.Z = LayoutInflater.from(this.bn).inflate(efj.gi, paramViewGroup, false);
    if (this.Z == null) {
      throw new IllegalStateException("Failed to inflate the filter fragment");
    }
    this.b = ((CropImageView)this.Z.findViewById(efj.fC));
    this.a = this.Z.findViewById(efj.gb);
    this.a.setVisibility(0);
    d(true);
    return this.Z;
  }
  
  final void a(int paramInt)
  {
    int i;
    label49:
    ToolButton localToolButton;
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Invalid aspect ratio index");
    case 0: 
      this.b.b(0.0F, false);
      i = 0;
      if (i >= this.d.length) {
        return;
      }
      localToolButton = this.d[i];
      if (i != paramInt) {
        break;
      }
    }
    for (boolean bool = true;; bool = false)
    {
      localToolButton.setSelected(bool);
      i++;
      break label49;
      float f = this.b.b();
      this.b.a(f, true);
      break;
      this.b.a(1.0F, true);
      break;
    }
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if (v() <= 0.0F)
    {
      ((LinearLayout)this.Z.findViewById(efj.fx)).setVisibility(0);
      int[] arrayOfInt1 = new int[3];
      arrayOfInt1[0] = efj.fI;
      arrayOfInt1[1] = efj.fQ;
      arrayOfInt1[2] = efj.gd;
      int[] arrayOfInt2 = { 0, 1, 2 };
      for (int i = 0; i < 3; i++)
      {
        this.d[i] = ((ToolButton)this.Z.findViewById(arrayOfInt1[i]));
        this.d[i].setOnClickListener(new ajr(this, arrayOfInt2, i));
      }
      a(0);
    }
    this.b.a(paramBitmap);
    float f = v();
    if (f > 0.0F) {
      this.b.a(f, true);
    }
    this.a.setVisibility(4);
  }
  
  public final void a(Menu paramMenu)
  {
    super.a(paramMenu);
    ActionBar localActionBar = f().getActionBar();
    if (localActionBar == null) {
      throw new IllegalStateException("Could not get action bar");
    }
    localActionBar.getCustomView().setOnClickListener(new ajq(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajp
 * JD-Core Version:    0.7.0.1
 */