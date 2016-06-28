import android.content.Context;
import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

public final class agz
  implements Runnable
{
  public agz(SearchView paramSearchView) {}
  
  public final void run()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
    ahl localahl;
    SearchView localSearchView;
    if (localInputMethodManager != null)
    {
      localahl = SearchView.l;
      localSearchView = this.a;
      if (localahl.d == null) {}
    }
    else
    {
      try
      {
        Method localMethod = localahl.d;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(0);
        arrayOfObject[1] = null;
        localMethod.invoke(localInputMethodManager, arrayOfObject);
        return;
      }
      catch (Exception localException) {}
    }
    localInputMethodManager.showSoftInput(localSearchView, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agz
 * JD-Core Version:    0.7.0.1
 */