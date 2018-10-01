# Qubes R4.0

## dom0

```
$ sudo qubes-dom0-update \
    google-noto-cjk-font \
    i3 \
    i3-settings-qubes
```


### /etc/conf/guid.conf

```
VM: {
  personal: {
    allow_utf8_titles = true;
  };
};
```


## fedora-26-korean

```
$ sudo dnf install \
    google-noto-cjk-fonts \
    ibus-hangul

$ ibus-setup
```
