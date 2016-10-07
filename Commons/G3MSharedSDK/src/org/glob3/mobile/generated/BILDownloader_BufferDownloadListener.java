package org.glob3.mobile.generated; 
public class BILDownloader_BufferDownloadListener extends IBufferDownloadListener
{
  private final Sector _sector ;
  private final Vector2I _extent = new Vector2I();
  private final short _noDataValue;
  private final double _deltaHeight;
  private BILDownloader.Handler _handler;
  private final boolean _deleteHandler;
  private final G3MContext _context;

  public BILDownloader_BufferDownloadListener(Sector sector, Vector2I extent, short noDataValue, double deltaHeight, BILDownloader.Handler handler, boolean deleteHandler, G3MContext context)
  {
     _sector = new Sector(sector);
     _extent = new Vector2I(extent);
     _noDataValue = noDataValue;
     _deltaHeight = deltaHeight;
     _handler = handler;
     _deleteHandler = deleteHandler;
     _context = context;
  }


  public void dispose()
  {
    if (_deleteHandler)
    {
      if (_handler != null)
         _handler.dispose();
    }
    super.dispose();
  }

  public final void onDownload(URL url, IByteBuffer buffer, boolean expired)
  {
    GAsyncTask parserTask = new BILDownloader_ParserAsyncTask(buffer, _sector, _extent, _noDataValue, _deltaHeight, _handler, _deleteHandler);
    _context.getThreadUtils().invokeAsyncTask(parserTask, true);

    _handler = null; // moves _handler ownership to BILDownloader_ParserAsyncTask
  }

  public final void onError(URL url)
  {
    _handler.onDownloadError(_context, url);
  }

  public final void onCancel(URL url)
  {
    // do nothing!
  }

  public final void onCanceledDownload(URL url, IByteBuffer buffer, boolean expired)
  {
    // do nothing!
  }
}