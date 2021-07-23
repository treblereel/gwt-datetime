//const $Util = goog.require('nativebootstrap.Util$impl');

let org_gwtproject_i18n_shared_cldr_impl_LocaleInfoImpl = goog.forwardDeclare('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoImpl$impl');

org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.get = function(locale) {
  LocaleInfoFactory.$clinit();
  if (LocaleInfoFactory.$static_holder__org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.has(locale)) {
   return LocaleInfoFactory.$static_holder__org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.get(locale);
  }
  return org_gwtproject_i18n_shared_cldr_impl_LocaleInfoImpl.$create__();
};

org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.m_getLocale__ = function() {
    console.log("m_getLocale__");

  return $Util.$getDefine("gwt.locale");
}


org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.m_getZZZ__ = function() {
  return $Util.$getDefine("gwt.locale");
}