let org_gwtproject_i18n_shared_cldr_impl_LocaleInfoImpl = goog.forwardDeclare('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoImpl$impl');
//  org_gwtproject_i18n_shared_cldr_impl_LocaleInfoImpl = goog.module.get('org.gwtproject.i18n.shared.cldr.impl.LocaleInfoImpl$impl');

org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.get = function(locale) {
  LocaleInfoFactory.$clinit();
  if (LocaleInfoFactory.$static_holder__org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.has(locale)) {
   return LocaleInfoFactory.$static_holder__org_gwtproject_i18n_shared_cldr_impl_LocaleInfoFactory.get(locale);
  }
  return org_gwtproject_i18n_shared_cldr_impl_LocaleInfoImpl.$create__();
};

