# gwt-i18n-cldr
GWT cldr classes generated from gwt-cldr-importer

### Dependencies

```xml
<dependency>
    <groupId>org.dominokit.i18n</groupId>
    <artifactId>gwt-cldr</artifactId>
    <version>1.0</version>
</dependency>
<dependency>
    <groupId>org.dominokit.i18n</groupId>
    <artifactId>gwt-cldr</artifactId>
    <version>1.0</version>
    <classifier>sources</classifier>
</dependency>
```

### Inherits

```xml
<inherits name="org.gwtproject.i18n.CLDR"/>
```

### Usage

- use the static factories to obtains localizable instance:

```
DateTimeFormatInfo dateTimeFormatInfo = DateTimeFormatInfo_factory.create();

LocalizedNames localizedNames = LocalizedNames_factory.create();
```
