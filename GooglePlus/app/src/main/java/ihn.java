import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.mtp.MtpDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class ihn
  extends BroadcastReceiver
{
  ihn(ihm paramihm) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    UsbDevice localUsbDevice = (UsbDevice)paramIntent.getParcelableExtra("device");
    String str2 = localUsbDevice.getDeviceName();
    MtpDevice localMtpDevice;
    synchronized (this.a.c)
    {
      localMtpDevice = (MtpDevice)this.a.c.get(str2);
      if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(str1))
      {
        if (localMtpDevice == null) {
          localMtpDevice = this.a.a(localUsbDevice);
        }
        if (localMtpDevice == null) {
          break label359;
        }
        Iterator localIterator1 = this.a.b.iterator();
        if (!localIterator1.hasNext()) {
          break label359;
        }
        ((iho)localIterator1.next()).a(localMtpDevice);
      }
    }
    if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(str1))
    {
      if (localMtpDevice != null)
      {
        this.a.c.remove(str2);
        this.a.d.remove(str2);
        this.a.e.remove(str2);
        Iterator localIterator2 = this.a.b.iterator();
        while (localIterator2.hasNext()) {
          ((iho)localIterator2.next()).b(localMtpDevice);
        }
      }
    }
    else if ("com.google.android.libraries.social.ingest.action.USB_PERMISSION".equals(str1))
    {
      this.a.d.remove(str2);
      boolean bool = paramIntent.getBooleanExtra("permission", false);
      new StringBuilder(28).append("ACTION_USB_PERMISSION: ").append(bool);
      if (bool)
      {
        if (localMtpDevice == null) {
          localMtpDevice = ihm.a(this.a, localUsbDevice);
        }
        if (localMtpDevice != null)
        {
          Iterator localIterator3 = this.a.b.iterator();
          while (localIterator3.hasNext()) {
            ((iho)localIterator3.next()).a(localMtpDevice);
          }
        }
      }
      else
      {
        this.a.e.add(str2);
      }
    }
    label359:
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihn
 * JD-Core Version:    0.7.0.1
 */