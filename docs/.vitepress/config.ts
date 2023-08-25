import {defineConfig} from 'vitepress'
import sidebars from './sidebars';

// 基础路径
const base = '/DesignPatterns',
    // google 分析
    google = 'G-1L1DPX3PFD',
    // 百度统计
    baidu = '8537fef7fc5f543ba1ad52b802978f07';

export default defineConfig({
    title: "设计模式",
    description: "A VitePress Site",
    lastUpdated: true,
    base: base,
    srcExclude: ['**/README.md'],
    head: [
        // google分析脚本
        [
            'script',
            {async: '', src: `https://www.googletagmanager.com/gtag/js?id=${google}`}
        ],
        // google、百度统计分析
        [
            'script',
            {},
            `var isProductEnv = window && window.location && window.location.host
                && window.location.host.indexOf('127.0.0.1') === -1
                && window.location.host.indexOf('localhost') === -1
                && window.location.host.indexOf('192.168.') === -1;
             if(isProductEnv) {
                window.dataLayer = window.dataLayer || [];
                function gtag(){dataLayer.push(arguments);}
                gtag('js', new Date());
                gtag('config', '${google}');
                
                var _hmt = _hmt || [];
                (function () {
                    var hm = document.createElement("script");
                    hm.src = "https://hm.baidu.com/hm.js?${baidu}";
                    var s = document.getElementsByTagName("script")[0];
                    s.parentNode.insertBefore(hm, s);
                })();
                _hmt.push(['_setAccount', '${baidu}']);
                _hmt.push(['_trackPageview', window.location]);
                _hmt.push(['_setAutoPageview', true]);
             }`
        ]
    ],
    sitemap: {
        hostname: `https://www.xiehai.zone`,
        lastmodDateOnly: false,
        // @ts-ignore
        transformItems(items) {
            // @ts-ignore
            return items.map(it => it.url = `${base}/${it.url}`);
        }
    },
    themeConfig: {
        nav: null,
        sidebar: sidebars(),
        search: {
            provider: 'local'
        },
        lastUpdated: {
            text: '最后更新'
        },
        editLink: {
            pattern: 'https://github.com/PasseRR/DesignPatterns/edit/master/docs/:path',
            text: 'Edit this page on GitHub'
        },
        logo: '/logo.jpg',
        outline: {
            level: [2, 6],
            label: '目录'
        },
        langMenuLabel: '菜单',
        returnToTopLabel: '回到顶部'
    },
    markdown: {
        lineNumbers: true,
        theme: {
            light: 'github-light',
            dark: 'github-dark'
        }
    }
});