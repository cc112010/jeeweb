package cn.jeeweb.ui.tags.html;

import java.io.IOException;
import cn.jeeweb.beetl.tags.TagSupport;
import cn.jeeweb.beetl.tags.annotation.BeetlTagName;
import cn.jeeweb.beetl.tags.exception.BeetlTagException;
import org.apache.commons.lang3.StringEscapeUtils;
import org.beetl.core.BodyContent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@BeetlTagName("html.display")
public class DisplayTag extends TagSupport {

	@Override
	public int doStartTag() throws BeetlTagException {
		return EVAL_PAGE;
	}

	protected String getContent() {
		BodyContent body = getBodyContent();
		String content = body.getBody();
		content = StringEscapeUtils.escapeHtml4(content);
		return content;
	}

	public int doEndTag() throws BeetlTagException {
		try {
			this.ctx.byteWriter.writeString(getContent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

}