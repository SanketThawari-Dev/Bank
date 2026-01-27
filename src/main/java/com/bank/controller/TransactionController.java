@Controller
public class TransactionController {

    private final TransactionService txnService;

    public TransactionController(TransactionService txnService) {
        this.txnService = txnService;
    }

    @GetMapping("/readtxn")
    public String readTxn(@RequestParam("uid") String uid, HttpSession session) {
        session.setAttribute("check", uid);
        session.setAttribute("al", txnService.readTxn(uid));
        return "redirect:/readtxn.jsp";
    }
}

