
var projectName = '疫情下图书馆管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '进馆预约',
	url: './pages/jinguanyuyue/list.html'
}, 
{
	name: '图书信息',
	url: './pages/tushuxinxi/list.html'
}, 
{
	name: '温馨提示',
	url: './pages/wenxintishi/list.html'
}, 

{
	name: '新书资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootp5hkd/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["查看","修改"],"menu":"健康打卡","menuJump":"列表","tableName":"jiankangdaka"}],"menu":"健康打卡管理"},{"child":[{"buttons":["修改","删除","预约","新增","查看"],"menu":"进馆预约","menuJump":"列表","tableName":"jinguanyuyue"}],"menu":"进馆预约管理"},{"child":[{"buttons":["查看","删除"],"menu":"用户预约","menuJump":"列表","tableName":"yonghuyuyue"}],"menu":"用户预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"图书分类","menuJump":"列表","tableName":"tushufenlei"}],"menu":"图书分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"buttons":["查看","修改","删除","报表","导出"],"menu":"预约借阅","menuJump":"列表","tableName":"yuyuejieyue"}],"menu":"预约借阅管理"},{"child":[{"buttons":["导出","修改","查看"],"menu":"预约归还","menuJump":"列表","tableName":"yuyueguihai"}],"menu":"预约归还管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"温馨提示","menuJump":"列表","tableName":"wenxintishi"}],"menu":"温馨提示管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","修改","新增","删除"],"menu":"新书资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"进馆预约列表","menuJump":"列表","tableName":"jinguanyuyue"}],"menu":"进馆预约模块"},{"child":[{"buttons":["查看","借阅","归还"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"温馨提示列表","menuJump":"列表","tableName":"wenxintishi"}],"menu":"温馨提示模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看"],"menu":"健康打卡","menuJump":"列表","tableName":"jiankangdaka"}],"menu":"健康打卡管理"},{"child":[{"buttons":["查看","预约"],"menu":"进馆预约","menuJump":"列表","tableName":"jinguanyuyue"}],"menu":"进馆预约管理"},{"child":[{"buttons":["查看","删除"],"menu":"用户预约","menuJump":"列表","tableName":"yonghuyuyue"}],"menu":"用户预约管理"},{"child":[{"buttons":["查看","查看评论","借阅","归还"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"buttons":["查看"],"menu":"预约借阅","menuJump":"列表","tableName":"yuyuejieyue"}],"menu":"预约借阅管理"},{"child":[{"buttons":["查看"],"menu":"预约归还","menuJump":"列表","tableName":"yuyueguihai"}],"menu":"预约归还管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"进馆预约列表","menuJump":"列表","tableName":"jinguanyuyue"}],"menu":"进馆预约模块"},{"child":[{"buttons":["查看","借阅","归还"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"温馨提示列表","menuJump":"列表","tableName":"wenxintishi"}],"menu":"温馨提示模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","审核"],"menu":"预约借阅","menuJump":"列表","tableName":"yuyuejieyue"}],"menu":"预约借阅管理"},{"child":[{"buttons":["查看","审核"],"menu":"预约归还","menuJump":"列表","tableName":"yuyueguihai"}],"menu":"预约归还管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"进馆预约列表","menuJump":"列表","tableName":"jinguanyuyue"}],"menu":"进馆预约模块"},{"child":[{"buttons":["查看","借阅","归还"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"温馨提示列表","menuJump":"列表","tableName":"wenxintishi"}],"menu":"温馨提示模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
