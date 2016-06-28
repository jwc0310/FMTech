import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.Spinner;
import com.google.android.apps.plus.fragments.EditEventFragment;
import java.util.Calendar;
import java.util.TimeZone;

public final class bzh
  extends bj
  implements DatePickerDialog.OnDateSetListener, DialogInterface.OnClickListener
{
  private int Z = -1;
  private boolean aa;
  
  public bzh() {}
  
  public bzh(int paramInt)
  {
    this.Z = paramInt;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    if (this.Z == -1)
    {
      this.Z = paramBundle.getInt("type");
      this.aa = paramBundle.getBoolean("cancelled", this.aa);
    }
    long l = this.m.getLong("date_time");
    TimeZone localTimeZone = hxk.a(this.m.getString("time_zone"));
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeZone(localTimeZone);
    localCalendar.setTimeInMillis(l);
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(f(), this, localCalendar.get(1), localCalendar.get(2), localCalendar.get(5));
    if (this.Z == 0)
    {
      int i = aau.dV;
      localDatePickerDialog.setButton(-2, g().getString(i), this);
    }
    return localDatePickerDialog;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("type", this.Z);
    paramBundle.putBoolean("cancelled", this.aa);
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    EditEventFragment localEditEventFragment = (EditEventFragment)this.n;
    switch (paramInt)
    {
    default: 
      return;
    }
    hxj localhxj = localEditEventFragment.ac;
    if (localhxj.a != null) {
      localhxj.a.i = null;
    }
    for (;;)
    {
      localEditEventFragment.x();
      localEditEventFragment.z();
      this.aa = true;
      return;
      localhxj.b.i = null;
    }
  }
  
  public final void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.aa) {
      return;
    }
    if (this.Z == 1)
    {
      EditEventFragment localEditEventFragment2 = (EditEventFragment)this.n;
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar2.setTimeZone(((hxm)localEditEventFragment2.am.getSelectedItem()).a);
      qdc localqdc3 = localEditEventFragment2.ac.i();
      String str4;
      if (localqdc3 == null)
      {
        String str3 = String.valueOf(localEditEventFragment2.ac.a());
        if (str3.length() != 0)
        {
          str4 = "Missing start time in event ".concat(str3);
          label94:
          Log.e("EditEventFragment", str4);
        }
      }
      for (Long localLong = Long.valueOf(EditEventFragment.v());; localLong = localqdc3.b)
      {
        localCalendar2.setTimeInMillis(localLong.longValue());
        if ((localCalendar2.get(1) == paramInt1) && (localCalendar2.get(2) == paramInt2) && (localCalendar2.get(5) == paramInt3)) {
          break;
        }
        localCalendar2.set(paramInt1, paramInt2, paramInt3);
        localEditEventFragment2.a(localCalendar2);
        localEditEventFragment2.w();
        localEditEventFragment2.y();
        qdc localqdc4 = localEditEventFragment2.ac.j();
        if ((localqdc4 == null) || (localqdc4.b.longValue() >= localCalendar2.getTimeInMillis())) {
          break;
        }
        localCalendar2.add(13, 7200);
        localEditEventFragment2.b(localCalendar2);
        localEditEventFragment2.x();
        localEditEventFragment2.z();
        return;
        str4 = new String("Missing start time in event ");
        break label94;
      }
    }
    EditEventFragment localEditEventFragment1 = (EditEventFragment)this.n;
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeZone(((hxm)localEditEventFragment1.am.getSelectedItem()).a);
    qdc localqdc1 = localEditEventFragment1.ac.j();
    label322:
    qdc localqdc2;
    String str1;
    if (localqdc1 != null)
    {
      localCalendar1.setTimeInMillis(localqdc1.b.longValue());
      if ((localqdc1 == null) || (localCalendar1.get(1) != paramInt1) || (localCalendar1.get(2) != paramInt2) || (localCalendar1.get(5) != paramInt3))
      {
        localCalendar1.set(paramInt1, paramInt2, paramInt3);
        localEditEventFragment1.b(localCalendar1);
        localEditEventFragment1.x();
        localEditEventFragment1.z();
      }
    }
    else
    {
      localqdc2 = localEditEventFragment1.ac.i();
      if (localqdc2 == null)
      {
        str1 = String.valueOf(localEditEventFragment1.ac.a());
        if (str1.length() == 0) {
          break label478;
        }
      }
    }
    label478:
    for (String str2 = "Missing start time in event ".concat(str1);; str2 = new String("Missing start time in event "))
    {
      Log.e("EditEventFragment", str2);
      localqdc2 = new qdc();
      localqdc2.b = Long.valueOf(EditEventFragment.v());
      localCalendar1.setTimeInMillis(7200000L + localqdc2.b.longValue());
      break label322;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzh
 * JD-Core Version:    0.7.0.1
 */