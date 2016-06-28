import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.Spinner;
import android.widget.TimePicker;
import com.google.android.apps.plus.fragments.EditEventFragment;
import java.util.Calendar;

public final class bzj
  extends bj
  implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnClickListener
{
  private int Z = -1;
  private boolean aa;
  
  public bzj() {}
  
  public bzj(int paramInt)
  {
    this.Z = paramInt;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    if (this.Z == -1)
    {
      this.Z = paramBundle.getInt("type", -1);
      this.aa = paramBundle.getBoolean("cancelled", this.aa);
    }
    long l = this.m.getLong("date_time");
    String str = this.m.getString("time_zone");
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeZone(hxk.a(str));
    localCalendar.setTimeInMillis(l);
    TimePickerDialog localTimePickerDialog = new TimePickerDialog(f(), this, localCalendar.get(11), localCalendar.get(12), DateFormat.is24HourFormat(f()));
    if (this.Z == 0)
    {
      int i = aau.dV;
      localTimePickerDialog.setButton(-2, g().getString(i), this);
    }
    return localTimePickerDialog;
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
      localEditEventFragment.z();
      localEditEventFragment.x();
      this.aa = true;
      return;
      localhxj.b.i = null;
    }
  }
  
  public final void onTimeSet(TimePicker paramTimePicker, int paramInt1, int paramInt2)
  {
    if (this.aa) {
      return;
    }
    EditEventFragment localEditEventFragment = (EditEventFragment)this.n;
    if (this.Z == 1)
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTimeZone(((hxm)localEditEventFragment.am.getSelectedItem()).a);
      qdc localqdc1 = localEditEventFragment.ac.i();
      String str2;
      if (localqdc1 == null)
      {
        String str1 = String.valueOf(localEditEventFragment.ac.a());
        if (str1.length() != 0)
        {
          str2 = "Missing start time in event ".concat(str1);
          label94:
          Log.e("EditEventFragment", str2);
        }
      }
      for (Long localLong = Long.valueOf(EditEventFragment.v());; localLong = localqdc1.b)
      {
        localCalendar.setTimeInMillis(localLong.longValue());
        if ((localCalendar.get(11) == paramInt1) && (localCalendar.get(12) == paramInt2)) {
          break;
        }
        localCalendar.set(11, paramInt1);
        localCalendar.set(12, paramInt2);
        long l = localCalendar.getTimeInMillis();
        localEditEventFragment.a(localCalendar);
        localEditEventFragment.y();
        qdc localqdc2 = localEditEventFragment.ac.j();
        if ((localqdc2 == null) || (localqdc2.b.longValue() >= l)) {
          break;
        }
        localCalendar.add(13, 7200);
        localEditEventFragment.b(localCalendar);
        localEditEventFragment.x();
        localEditEventFragment.z();
        return;
        str2 = new String("Missing start time in event ");
        break label94;
      }
    }
    localEditEventFragment.a(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzj
 * JD-Core Version:    0.7.0.1
 */