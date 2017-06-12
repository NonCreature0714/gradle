/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.internal.logging.console

import org.gradle.internal.logging.text.Span

class TestStyledLabel implements StyledLabel {
    String display = ""

    String getDisplay() {
        display
    }

    @Override
    void setText(String text) {
        display = text;
    }

    @Override
    void setText(List<Span> spans) {
        String text = ""
        for (Span span : spans) {
            text += span.text
        }

        setText(text)
    }

    @Override
    void setText(Span... spans) {
        setText(Arrays.asList(spans))
    }
}