import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.plus.views.TypeableAudienceView.AudienceTextView;

public final class dzu
  extends InputConnectionWrapper
{
  public TypeableAudienceView.AudienceTextView a;
  
  public dzu(TypeableAudienceView.AudienceTextView paramAudienceTextView, InputConnection paramInputConnection, boolean paramBoolean)
  {
    super(paramInputConnection, true);
  }
  
  public final boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    if ((this.b.getSelectionStart() <= 0) && (this.b.getSelectionEnd() <= 0)) {}
    for (int i = 1; (paramInt1 > 0) && (paramInt2 <= 0) && (i != 0) && (this.b.a != null) && (this.a != null); i = 0)
    {
      this.b.a.a(this.a);
      return true;
    }
    return super.deleteSurroundingText(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzu
 * JD-Core Version:    0.7.0.1
 */