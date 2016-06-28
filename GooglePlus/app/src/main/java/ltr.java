import android.database.Cursor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class ltr
  extends mab
  implements ltc
{
  public final ltb a(Cursor paramCursor)
  {
    if ((paramCursor != null) && (!paramCursor.isClosed()))
    {
      String str = paramCursor.getString(1);
      long l1 = paramCursor.getLong(2);
      long l2 = paramCursor.getLong(3);
      long l3 = paramCursor.getLong(4);
      List localList = mab.d(paramCursor.getBlob(5));
      byte[] arrayOfByte = paramCursor.getBlob(6);
      ArrayList localArrayList = new ArrayList();
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      int i = localByteBuffer.getInt();
      for (int j = 0; j < i; j++) {
        localArrayList.add(Long.valueOf(localByteBuffer.getLong()));
      }
      return new ltb(str, l1, 1L, l2, l3, localList, localArrayList);
    }
    throw new IllegalArgumentException("Failed to deserialize due to invalid cursor.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltr
 * JD-Core Version:    0.7.0.1
 */