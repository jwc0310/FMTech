import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import java.util.List;

public final class ler
  implements View.OnClickListener
{
  public ler(leq paramleq, lee paramlee, String paramString1, boolean paramBoolean, int paramInt, SpaceListItemView paramSpaceListItemView, String paramString2) {}
  
  public final void onClick(View paramView)
  {
    lee locallee = this.a;
    String str1 = this.b;
    boolean bool;
    SpaceListItemView localSpaceListItemView;
    Context localContext2;
    int j;
    Object[] arrayOfObject2;
    if (!this.c)
    {
      bool = true;
      locallee.a(str1, bool);
      if (efj.B(this.g.a))
      {
        localSpaceListItemView = this.e;
        if (this.c) {
          break label156;
        }
        localContext2 = this.g.a;
        j = aaw.qr;
        arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.f;
      }
    }
    label156:
    Context localContext1;
    int i;
    Object[] arrayOfObject1;
    for (String str2 = localContext2.getString(j, arrayOfObject2);; str2 = localContext1.getString(i, arrayOfObject1))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(16384);
      localAccessibilityEvent.getText().add(str2);
      localSpaceListItemView.onInitializeAccessibilityEvent(localAccessibilityEvent);
      localAccessibilityEvent.setContentDescription(null);
      localSpaceListItemView.requestSendAccessibilityEvent(localSpaceListItemView, localAccessibilityEvent);
      localSpaceListItemView.requestFocus();
      return;
      bool = false;
      break;
      localContext1 = this.g.a;
      i = aaw.qs;
      arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.f;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ler
 * JD-Core Version:    0.7.0.1
 */