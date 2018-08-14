package com.sap.cloud.lm.sl.mta.model.v2_0;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

import com.sap.cloud.lm.sl.common.util.ListUtil;
import com.sap.cloud.lm.sl.common.util.MapUtil;
import com.sap.cloud.lm.sl.mta.model.ParametersContainer;
import com.sap.cloud.lm.sl.mta.parsers.v2_0.ExtensionDescriptorParser;
import com.sap.cloud.lm.sl.mta.util.YamlElement;
import com.sap.cloud.lm.sl.mta.util.YamlElementOrder;

@YamlElementOrder({ "id", "description", "parentId", "provider", "schemaVersion", "parameters", "modules2_0", "resources2_0" })
public class ExtensionDescriptor extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionDescriptor implements ParametersContainer {

    @YamlElement(ExtensionDescriptorParser.MODULES)
    private List<ExtensionModule> modules2_0;
    @YamlElement(ExtensionDescriptorParser.RESOURCES)
    private List<ExtensionResource> resources2_0;
    @YamlElement(ExtensionDescriptorParser.PARAMETERS)
    private Map<String, Object> parameters;

    protected ExtensionDescriptor() {

    }

    public List<ExtensionModule> getModules2_0() {
        return ListUtil.upcastUnmodifiable(getModules());
    }

    @Override
    public List<? extends ExtensionModule> getModules() {
        return modules2_0;
    }

    public List<ExtensionResource> getResources2_0() {
        return ListUtil.upcastUnmodifiable(getResources());
    }

    @Override
    public List<? extends ExtensionResource> getResources() {
        return resources2_0;
    }

    @Override
    public Map<String, Object> getProperties() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, Object> getParameters() {
        return MapUtil.unmodifiable(parameters);
    }

    public void setModules2_0(List<ExtensionModule> modules) {
        setModules(modules);
    }

    @Override
    protected void setModules(List<? extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionModule> modules) {
        this.modules2_0 = ListUtil.cast(modules);
    }

    public void setResources2_0(List<ExtensionResource> resources) {
        setResources(resources);
    }

    @Override
    protected void setResources(List<? extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionResource> resources) {
        this.resources2_0 = ListUtil.cast(resources);
    }

    @Override
    public void setProperties(Map<String, Object> properties) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = new LinkedHashMap<>(parameters);
    }

    public static class Builder extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionDescriptor.Builder {

        protected List<ExtensionModule> modules2_0;
        protected List<ExtensionResource> resources2_0;
        protected Map<String, Object> parameters;

        @Override
        public ExtensionDescriptor build() {
            ExtensionDescriptor result = new ExtensionDescriptor();
            result.setId(id);
            result.setDescription(description);
            result.setParentId(parentId);
            result.setProvider(provider);
            result.setSchemaVersion(schemaVersion);
            result.setResources2_0(ObjectUtils.defaultIfNull(resources2_0, Collections.<ExtensionResource> emptyList()));
            result.setDeployTargets(ObjectUtils.defaultIfNull(deployTargets, Collections.<String> emptyList()));
            result.setParameters(ObjectUtils.defaultIfNull(parameters, Collections.<String, Object> emptyMap()));
            result.setModules2_0(ObjectUtils.defaultIfNull(modules2_0, Collections.<ExtensionModule> emptyList()));
            return result;
        }

        public void setModules2_0(List<ExtensionModule> modules) {
            setModules(modules);
        }

        @Override
        protected void setModules(List<? extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionModule> modules) {
            this.modules2_0 = ListUtil.cast(modules);
        }

        public void setResources2_0(List<ExtensionResource> resources) {
            setResources(resources);
        }

        @Override
        protected void setResources(List<? extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionResource> resources) {
            this.resources2_0 = ListUtil.cast(resources);
        }

        public void setParameters(Map<String, Object> parameters) {
            this.parameters = parameters;
        }

        @Override
        public void setProperties(Map<String, Object> properties) {
            throw new UnsupportedOperationException();
        }

    }

}
