const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootp5hkd/",
            name: "springbootp5hkd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootp5hkd/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疫情下图书馆管理系统"
        } 
    }
}
export default base
