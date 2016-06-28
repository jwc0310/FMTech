import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

public final class ahl
{
  public Method a;
  public Method b;
  public Method c;
  Method d;
  
  public ahl()
  {
    try
    {
      this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      this.a.setAccessible(true);
      try
      {
        label27:
        this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
        try
        {
          label50:
          Class[] arrayOfClass2 = new Class[1];
          arrayOfClass2[0] = Boolean.TYPE;
          this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", arrayOfClass2);
          this.c.setAccessible(true);
          try
          {
            label84:
            Class[] arrayOfClass1 = new Class[2];
            arrayOfClass1[0] = Integer.TYPE;
            arrayOfClass1[1] = ResultReceiver.class;
            this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", arrayOfClass1);
            this.d.setAccessible(true);
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException4) {}
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          break label84;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label50;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      break label27;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahl
 * JD-Core Version:    0.7.0.1
 */