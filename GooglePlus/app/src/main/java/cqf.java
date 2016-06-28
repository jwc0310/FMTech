import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.MediaController;
import android.widget.VideoView;

final class cqf
  extends MediaController
  implements View.OnClickListener
{
  cqf(cqc paramcqc, Context paramContext)
  {
    super(paramContext);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      this.a.f().onBackPressed();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void onClick(View paramView)
  {
    cqc localcqc;
    if (paramView.getId() == aaw.be)
    {
      localcqc = this.a;
      if (((CheckBox)paramView).isChecked()) {
        break label94;
      }
    }
    label94:
    for (boolean bool = true;; bool = false)
    {
      if (localcqc.c != bool)
      {
        localcqc.c = bool;
        localcqc.aa = true;
        localcqc.e(localcqc.N);
        localcqc.d.hide();
        int i = localcqc.Z.getCurrentPosition();
        localcqc.w();
        localcqc.v();
        localcqc.Z.seekTo(i);
        localcqc.Z.start();
      }
      return;
    }
  }
  
  public final void setAnchorView(View paramView)
  {
    super.setAnchorView(paramView);
    CheckBox localCheckBox;
    if ((this.a.a != null) && (this.a.b != null))
    {
      localCheckBox = (CheckBox)LayoutInflater.from(getContext()).inflate(efj.tQ, this).findViewById(aaw.be);
      if (this.a.c) {
        break label72;
      }
    }
    label72:
    for (boolean bool = true;; bool = false)
    {
      localCheckBox.setChecked(bool);
      localCheckBox.setOnClickListener(this);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqf
 * JD-Core Version:    0.7.0.1
 */