/*
 * #%L
 * Connected
 * %%
 * Copyright (C) 2017 Vertispan
 * %%
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
 * #L%
 */

// Defer this command, since this will be folded into the FlowChartEntryPoint js impl,
// and if it runs right away, will not have its dependencies resolved yet (at least while
// running in BUNDLE).

/*let LocaleInfoImpl__ru = goog.forwardDeclare('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoImpl_ru$impl');

let temp = goog.forwardDeclare('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoImpl$impl');


let factory = goog.module.get('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoFactory$impl')

//let factory = goog.forwardDeclare('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoFactory$impl');

factory.f_holder__org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.set("ru", temp.$create__());*/


setTimeout(function(){
  // Call the java "constructor" method, `new` will only work if it is a @JsType, or maybe
  // once optimized. Without this, in BUNDLE mode, `new` doesn't include the clinit, so
  // static imports haven't been resolved yet.
  var ep = App.$create__();
  // Invoke onModuleLoad to start the app.
  ep.m_onModuleLoad__()
}, 0);

