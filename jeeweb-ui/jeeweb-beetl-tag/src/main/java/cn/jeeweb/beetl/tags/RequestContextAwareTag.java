package cn.jeeweb.beetl.tags;

import cn.jeeweb.beetl.tags.exception.BeetlTagException;
import cn.jeeweb.common.utils.ServletUtils;
import com.sun.istack.Nullable;
import org.springframework.util.Assert;
import cn.jeeweb.beetl.tags.support.RequestContext;


public abstract class RequestContextAwareTag  extends TagSupport {

	public static final String REQUEST_CONTEXT_PAGE_ATTRIBUTE = "org.springframework.web.servlet.tags.REQUEST_CONTEXT";

	@Nullable
	private RequestContext requestContext;

	protected final RequestContext getRequestContext() {
		Assert.state(this.requestContext != null, "No current RequestContext");
		return this.requestContext;
	}

	protected abstract int doStartTagInternal() throws BeetlTagException;

	protected int doStartTag() throws BeetlTagException{
		this.requestContext = (RequestContext) this.ctx.globalVar.get(REQUEST_CONTEXT_PAGE_ATTRIBUTE);
		if (this.requestContext == null) {
			this.requestContext = new RequestContext(ServletUtils.getRequest(),this.ctx.globalVar);
			this.ctx.globalVar.put(REQUEST_CONTEXT_PAGE_ATTRIBUTE, this.requestContext);
		}
		return doStartTagInternal();
	}

	protected int doEndTag() throws BeetlTagException{
		return 1;
	}

	public void doFinally() {
		this.requestContext = null;
	}
}
