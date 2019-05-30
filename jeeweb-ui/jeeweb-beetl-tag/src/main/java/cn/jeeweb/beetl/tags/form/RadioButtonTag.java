/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.jeeweb.beetl.tags.form;

import cn.jeeweb.beetl.tags.annotation.BeetlTagName;
import cn.jeeweb.beetl.tags.form.AbstractSingleCheckedElementTag;
import cn.jeeweb.beetl.tags.form.TagWriter;

import cn.jeeweb.beetl.tags.exception.BeetlTagException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@BeetlTagName("form.radiobutton")
public class RadioButtonTag extends AbstractSingleCheckedElementTag {

	@Override
	protected void writeTagDetails(TagWriter tagWriter) throws BeetlTagException {
		tagWriter.writeAttribute("type", getInputType());
		Object resolvedValue = evaluate("value", getValue());
		renderFromValue(resolvedValue, tagWriter);
	}

	@Override
	protected String getInputType() {
		return "radio";
	}

}
