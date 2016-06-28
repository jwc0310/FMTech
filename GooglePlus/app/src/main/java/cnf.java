import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public final class cnf
  extends cmz
{
  private final Spinner a;
  private final EditText b;
  
  public cnf(cna paramcna, int paramInt, Spinner paramSpinner, EditText paramEditText)
  {
    super(paramcna, paramInt);
    this.a = paramSpinner;
    this.b = paramEditText;
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    super.onItemSelected(paramAdapterView, paramView, paramInt, paramLong);
    EditText localEditText;
    int i;
    if (paramInt == 5)
    {
      this.a.setVisibility(0);
      localEditText = this.b;
      switch (paramInt)
      {
      default: 
        i = 1;
      }
    }
    for (;;)
    {
      localEditText.setInputType(i);
      return;
      this.a.setVisibility(4);
      break;
      i = 3;
      continue;
      i = 33;
      continue;
      i = 97;
      continue;
      i = 131185;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnf
 * JD-Core Version:    0.7.0.1
 */