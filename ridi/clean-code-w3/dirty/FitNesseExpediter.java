public class FitNesseExpediter implements ResponseSender {
    private    Socket          socket;
    private    InputStream     input;
    private    OutputStream    output;
    private    Request         request;
    private    Response        reponse;
    private    FitNesseContext context;
    protected long             requestParsingTimeLimit;
    private   long             requestProgress;
    private   long             requestParsingDeadline;

    public FitNesseExpediter(Socket          s,
                             FitNesseContext context) throws Exception
    {
        this.context            = context;
        socket                  = s;
        input                   = s.getInputStream();
        output                  = s.getOutputStream();
        requestParsingTimeLimit = 10000;
    }
