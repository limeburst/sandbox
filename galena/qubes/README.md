# Qubes R4.0

## dom0

```
$ sudo qubes-dom0-update \
    google-noto-cjk-font \
    i3 \
    i3-settings-qubes \
    qubes-template-fedora-28
```


### /etc/conf/guid.conf

```
VM: {
  personal: {
    allow_utf8_titles = true;
  };
};
```


## fedora-28-korean

```
$ sudo dnf install \
    automake \
    gmp-devel \
    google-noto-cjk-fonts \
    ibus-hangul \
    ncurses-devel
```


## personal

```
$ ibus-setup
$ curl -sSL https://get.haskellstack.org/ | sh
```
